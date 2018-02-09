package com.winscheater.multitool

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@MapperScan("com.winscheater.multitool.mapper")
class MultiToolApplication {

	static void main(String[] args) {
		SpringApplication.run(MultiToolApplication.class, args)
	}
}
