package com.zf.base;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * BaseCorsFilter
 *
 * @author zf
 * @date 16/3/21s
 */
@Component("baseCorsFilter")
public class BaseCorsFilter {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setMaxAge(3600L);
        config.addAllowedOrigin(CorsConfiguration.ALL);
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedHeader("x-requested-with");
        source.registerCorsConfiguration("/app/**", config);
        return new CorsFilter(source);
    }
}
