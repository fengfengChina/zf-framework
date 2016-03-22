package com.zf.base;

import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * DefalutTokenManager
 *
 * @author zf
 * @date 16/3/21
 */
public class DefalutTokenManager implements TokenManager{

        private static Map<String, String> tokenMap = new ConcurrentHashMap<>();

        @Override
        public String createToken(String username) {
            String token = UUID.randomUUID().toString();
            tokenMap.put(token, username);
            return token;
        }

        @Override
        public boolean checkToken(String token) {
            return !StringUtils.isEmpty(token) && tokenMap.containsKey(token);
        }

}
