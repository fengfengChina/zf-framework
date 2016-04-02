package com.zf.controller;

import com.zf.base.Response;
import com.zf.service.AreaService;
import com.zf.service.UserAddressService;
import com.zf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * UserAddressController
 *  用户地址管理
 * @author zf
 * @date 16/4/2
 */
@RestController()
@RequestMapping(value ="/api/" )
public class UserAddressController {

    @Autowired
    UserAddressService userAddressService;

    @Autowired
    UserService userService;
    /**
     * 获取县区数据
     * @param city_id
     * @return
     */
    @RequestMapping("/getUserAddress")
    public Object getUserAddress(@RequestParam Integer city_id,Principal principal){
//            principal.getName().get
//        return new Response().success(userAddressService.(city_id));
        return null;
    }

}
