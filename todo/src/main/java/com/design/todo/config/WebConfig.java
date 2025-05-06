package com.design.todo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  // Allow cross-origin requests for all API endpoints
                .allowedOrigins("http://localhost:3000")  // Frontend's URL
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
