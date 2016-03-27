package com.zf.base.exception;

import com.zf.base.IgnoreSecurity;
import com.zf.base.TokenException;
import com.zf.base.TokenManager;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * SecurityAspect
 *
 * @author zf
 * @date 16/3/21
 */
//@Aspect
//@Component("securityAspect")
public class SecurityAspect {

    private static final String DEFAULT_TOKEN_NAME = "Token";

    private TokenManager tokenManager;
    private String tokenName;

    @Autowired(required = false)
    protected HttpServletRequest request;
    public void setTokenManager(TokenManager tokenManager) {
        this.tokenManager = tokenManager;
    }

    public void setTokenName(String tokenName) {
        if (StringUtils.isEmpty(tokenName)) {
            tokenName = DEFAULT_TOKEN_NAME;
        }
        this.tokenName = tokenName;
    }

    public Object execute(ProceedingJoinPoint pjp) throws Throwable {
        // 从切点上获取目标方法
        MethodSignature methodSignature = (MethodSignature) pjp.getSignature();
        Method method = methodSignature.getMethod();
        // 若目标方法忽略了安全性检查，则直接调用目标方法
        if (method.isAnnotationPresent(IgnoreSecurity.class)) {
            return pjp.proceed();
        }
        // 从 request header 中获取当前 token
        String token = request.getHeader(tokenName);
        // 检查 token 有效性
        if (!tokenManager.checkToken(token)) {
            String message = String.format("token [%s] is invalid", token);
            throw new TokenException(message);
        }
        // 调用目标方法
        return pjp.proceed();
    }

}
