package com.example.todo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/api/**") // 어떤 요청에 대해서 허용할지?
                .allowedOrigins("http://localhost:3000") //어떤 크라이언트를 허용할지
                .allowedMethods("*") //어떤 요청 방식을 허용할지
                .allowedHeaders("*") //어떤 요청 헤더를 허용할지
                .allowCredentials(true) //쿠키 전달을 허용할 것인지
                .maxAge(3600); // 캐싱 시간을 설정
    }

}
