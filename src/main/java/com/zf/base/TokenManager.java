package com.zf.base;

/**
 * TokenManager
 *
 * @author zf
 * @date 16/3/21
 */
public interface TokenManager {

    String createToken(String username);

    boolean checkToken(String token);
}
