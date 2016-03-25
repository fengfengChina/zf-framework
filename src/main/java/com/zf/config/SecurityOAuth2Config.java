package com.zf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * Created by kevinzou on 3/25/16.
 * SecurityOAuth2Config
 */
@Configuration
public class SecurityOAuth2Config {

    private static final String RESOURCE_ID = "restservice";

    @EnableAuthorizationServer
    protected static class AuthorizationServerConfig extends
            AuthorizationServerConfigurerAdapter {

        @Autowired
        private AuthenticationManager authenticationManager;

        @Autowired
        @Qualifier("sampleUserDetailsService")
        private UserDetailsService sampleUserDetailsService;

//        @Autowired
//        @Qualifier("sampleClientDetailsService")
//        private ClientDetailsService sampleClientDetailsService;

        private TokenStore tokenStore = new InMemoryTokenStore();

        @Override
        public void configure(AuthorizationServerEndpointsConfigurer endpoints)
                throws Exception {
            endpoints
                    .tokenStore(this.tokenStore)
                    .authenticationManager(this.authenticationManager);
        }

        @Override
        public void configure(ClientDetailsServiceConfigurer clients)
                throws Exception {
            // clients.withClientDetails(this.sampleClientDetailsService);
            // @formatter off
            clients.inMemory().withClient("sampleClientId").secret("clientSecretKey")
                    .authorizedGrantTypes("authorization_code", "password", "refresh_token")
                    .scopes("read", "write")
                    .autoApprove(true)
                    .resourceIds(RESOURCE_ID);
            // @formatter on
        }
    }

    @EnableResourceServer
    protected static class ResourceServerConfig extends
            ResourceServerConfigurerAdapter {

        @Override
        public void configure(HttpSecurity http) throws Exception {
            // private resources URLs
            http
                    .requestMatchers().antMatchers("/api/**")
                    .and()
                    .authorizeRequests()
//                    .antMatchers("/api/**").hasAnyRole("ROLE_USER", "ADMIN", "CLIENT")
                    .antMatchers("/api/user/**").authenticated();
        }

        @Override
        public void configure(ResourceServerSecurityConfigurer resources)
                throws Exception {
            resources.resourceId(RESOURCE_ID);
        }

    }
}
