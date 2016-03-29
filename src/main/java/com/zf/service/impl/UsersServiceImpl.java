package com.zf.service.impl;

import com.zf.config.SimpleUserDetails;
import com.zf.dao.UsersRepository;
import com.zf.domian.HdUsers;
import com.zf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.transaction.Transactional;

/**
 * UsersServiceImpl
 *
 * @author zf
 * @date 16/3/21
 */
@Transactional
@Component("usersService")
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersRepository usersRepository;

    @Autowired SimpleUserDetails simpleUserDetails;
    /**
     * 用户登录
     * @param mobile_phone
     * @param password
     * @return
     */
    @Override
    public HdUsers login(String mobile_phone, String password) {
        Assert.notNull(mobile_phone,"用户名不能为空");
        Assert.notNull(password,"密码不能为空");
        return usersRepository.findByUserNameAndPassword(mobile_phone , password);
    }

    @Override
    public HdUsers registerUsers(String mobile_phone, String password) {
        return usersRepository.save(new HdUsers(mobile_phone, password));
    }

    @Override
    public HdUsers motifyUserPassword(String old_password, String password) {
        return null;
    }



    @Override
    public HdUsers weChatLogin(String weixin_id) {
        return new HdUsers();
    }

    @Override
    public HdUsers findByWechatId(String weixin_id) {
        return usersRepository.findByWeixinId(weixin_id);
    }

    @Override
    public boolean addUser( String weixin_id) {
        HdUsers hdUsers = new HdUsers();
        hdUsers.setWeixinId(weixin_id);
        if(null !=usersRepository.save((hdUsers))){
            return true;
        }
        return false;
    }

    @Override
    public HdUsers findByUsersId(Integer userId) {
        return usersRepository.findByUserId(userId);
    }


    @Override
    public HdUsers motifyUserInfo(String userName, String realName, String nickName, String email, String sex, String birthday, String mobilePhone, String regTime, String userHead) {
        return null;
    }

    @Override
    public HdUsers findByUserName(String username) {
        return usersRepository.findByUserName(username);
    }


}
