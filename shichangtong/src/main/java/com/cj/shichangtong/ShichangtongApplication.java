package com.cj.shichangtong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@MapperScan(basePackages = "com.cj.shichangtong.mapper")
@SpringBootApplication
public class ShichangtongApplication extends SpringBootServletInitializer{

	@Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
        return application.sources(ShichangtongApplication.class);  
    }  
	
	public static void main(String[] args) {
		SpringApplication.run(ShichangtongApplication.class, args);
	}
}
