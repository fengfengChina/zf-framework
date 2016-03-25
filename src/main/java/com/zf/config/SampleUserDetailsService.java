package com.zf.config;

import com.zf.domian.HdUsers;
import com.zf.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by kevinzou on 3/25/16.
 * SampleUserDetailsService
 */
@Service("sampleUserDetailsService")
public class SampleUserDetailsService implements UserDetailsService {

    private final UsersService usersService;

    @Autowired
    public SampleUserDetailsService(UsersService usersService) {
        this.usersService = usersService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        HdUsers user = usersService.findByUserName(username);

        if (user == null) {
            throw new UsernameNotFoundException("username not found");
        }
        return new SimpleUserDetails(user);
    }

}
