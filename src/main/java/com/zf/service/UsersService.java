package com.zf.service;

import com.zf.domian.HdUsers;

/**
 * Users
 *
 * @author zf
 * @date 16/3/8
 */
public interface UsersService {
    HdUsers login(String mobile_phone, String password);

    HdUsers registerUsers(String mobile_phone, String password);

    HdUsers motifyUserPassword(String old_password, String password);

    HdUsers weChatLogin(String weixin_id);

    HdUsers findByWechatId(String weixin_id);

    boolean addUser( String weixin_id);

    HdUsers findByUsersId(Integer user_id);

    HdUsers motifyUserInfo(String userName, String realName, String nickName, String email, String sex, String birthday, String mobilePhone, String regTime, String userHead);

    HdUsers findByUserName(String username);
}
