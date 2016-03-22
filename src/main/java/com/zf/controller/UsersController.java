package com.zf.controller;

import com.zf.base.DefalutTokenManager;
import com.zf.base.Response;
import com.zf.domian.HdUsers;
import com.zf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * UsersController
 *
 * @author zf
 * @date 16/3/20
 */
@RestController
@RequestMapping("/app/users")
public class UsersController {
    @Autowired
    UsersService usersService;

    /**
     * 登录
     *
     * @param userName
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/login/{userName}/{password}")
    public Object userLogin(@PathVariable String userName, @PathVariable String password, HttpSession session) {
        HdUsers users = usersService.login(userName, password);
        if (users != null) {
            session.setAttribute("user", users);
        }
        return users;
    }

    /**
     * 修改个人信息
     *
     * @param old_password
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/motifyUsers/{mobile_phone}/{password}")
    public Object motifyUsers(@PathVariable String old_password, @PathVariable String password, HttpSession session) {
        HdUsers users = usersService.motifyUserPassword(old_password, new String(Base64Utils.decodeFromString(password)));
        if (users != null) {
            return new Response().success(users);
        } else {
            return new Response().failure("修改失败");
        }
    }


    /**
     * 注册用户
     *
     * @param mobile_phone
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/registerUsers/{mobile_phone}/{password}/{code}/")
    public Object registerUsers(@PathVariable String mobile_phone, @PathVariable String password, HttpSession session, @PathVariable String code) throws IOException {
        if (session.getAttribute("code").equals(code)) {
            HdUsers hdUsers = usersService.registerUsers(mobile_phone, password);
            if (hdUsers != null) {
                return new Response().success();
            } else {
                return new Response().failure("用户已经存在");
            }
        } else {
            return new Response().failure("验证码错误");
        }
    }

    /**
     * 微信登录
     *
     * @param weixin_id
     * @param session
     * @return
     */
    @RequestMapping("/wechatLogin/{weixin_id}")
    public Object wechatLogin(@PathVariable String weixin_id, HttpSession session) {
        HdUsers users = usersService.findByWechatId(weixin_id);
        if (users != null) {
            DefalutTokenManager defalutTokenManager = new DefalutTokenManager();
            defalutTokenManager.createToken(String.valueOf(users.getUserId()));
            return new Response().success(users);
        } else {
            if (usersService.addUser(weixin_id)) {
                HdUsers users1 = usersService.findByWechatId(weixin_id);
                DefalutTokenManager defalutTokenManager = new DefalutTokenManager();
                defalutTokenManager.createToken(String.valueOf(users1.getUserId()));
                return new Response().success(users1);
            }
            return new Response().failure("数据库异常");
        }
    }
}
