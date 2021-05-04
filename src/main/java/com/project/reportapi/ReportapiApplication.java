package com.project.reportapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.*;

@SpringBootApplication
public class ReportapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportapiApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry
                	.addMapping("/**")
                	.allowedOrigins("*")
                	.allowedMethods("PUT", "DELETE", "GET", "POST");
            }
        };
    }
}
