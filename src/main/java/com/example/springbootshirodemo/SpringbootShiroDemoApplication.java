package com.example.springbootshirodemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootshirodemo.mapper")
public class SpringbootShiroDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootShiroDemoApplication.class, args);
	}

}
