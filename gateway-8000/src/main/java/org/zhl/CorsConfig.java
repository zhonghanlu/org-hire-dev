package org.zhl;

import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

//@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter() {
        // 1. 添加cors配置信息
        CorsConfiguration config = new CorsConfiguration();
        // 允许所有域名进行跨域调用
        config.addAllowedOriginPattern("*");
        // 设置是否发送cookie信息
        config.setAllowCredentials(true);
        // 设置允许请求的方式
        config.addAllowedMethod("*");
        // 设置允许的header
        config.addAllowedHeader("*");
        // 2. 为url添加映射路径
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**", config);
        // 3. 返回重新定义好的corsSource
        return new CorsWebFilter(corsSource);
    }

}
