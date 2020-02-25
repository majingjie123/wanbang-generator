package com.wanbang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wanbang.dao")
public class WanBangApplication {

	public static void main(String[] args) {
		SpringApplication.run(WanBangApplication.class, args);
	}
}
