package com.zf.controller;

import com.zf.base.DefalutTokenManager;
import com.zf.base.Response;
import com.zf.domian.HdUsers;
import com.zf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.Principal;

/**
 * UsersController
 *
 * @author zf
 * @date 16/3/20
 */
@RestController
@RequestMapping("/api/")
public class UsersController {
    @Autowired
    UsersService usersService;


    /**
     * rest test, return name
     * @param principal 权限
     * @return name
     */
    @RequestMapping("/name")
    public String name(Principal principal) {
        return principal.getName();
    }

    /**
     * 登录
     *
     * @param mobilePhone
     * @param password
     * @return
     */
    @RequestMapping("/login")
    public Object userLogin(@RequestParam(value = "mobilePhone") String mobilePhone, @RequestParam(value = "password") String password) {
        HdUsers users = usersService.login(mobilePhone, password);
        if (users != null) {
            return  new Response().success(users);
        }
        return new Response().failure("不存在该用户");
    }

    /**
     * 修改用户名或密ma
     * @param old_password
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/motifyUsers")
    public Object motifyUsers(@RequestParam(value ="mobile_phone") String old_password, @RequestParam("password") String password, HttpSession session) {
        HdUsers users = usersService.motifyUserPassword(old_password, new String(Base64Utils.decodeFromString(password)));
        if (users != null) {
            return new Response().success(users);
        } else {
            return new Response().failure("修改失败");
        }
    }


    /**
     * 修改用户信息
     * @param userName
     * @param realName
     * @param nickName
     * @param email
     * @param sex
     * @param birthday
     * @param mobilePhone
     * @param regTime
     * @param userHead
     * @return
     */
    @RequestMapping("/motifyUsersInfo")
    public Object motifyUsersinfo(String userName,String realName,String nickName,String email,String sex,String birthday,String mobilePhone,String regTime,String userHead) {
        HdUsers users = usersService.motifyUserInfo(userName, realName, nickName, email, sex, birthday, mobilePhone, regTime, userHead);
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
     * @return
     */
    @RequestMapping("/registerUsers")
    public Object registerUsers(@RequestParam(value ="mobile_phone" ) String mobile_phone
            , @RequestParam(value ="password" )  String password, @RequestParam(value = "code") String code) throws IOException {
            HdUsers hdUsers = usersService.registerUsers(mobile_phone, password);
            if (hdUsers != null) {
                return new Response().success();
            } else {
                return new Response().failure("用户已经存在");
            }
    }

    /**
     * 微信登录
     *
     * @param weixin_id
     * @param session
     * @return
     */
    @RequestMapping("/wechatLogin")
    public Object wechatLogin(@RequestParam(value = "weixin_id") String weixin_id, HttpSession session) {
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
