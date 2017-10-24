package com.cj.shichangtong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan(basePackages = "com.cj.shichangtong.mapper")
@SpringBootApplication
public class ShichangtongApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShichangtongApplication.class, args);
	}
}
