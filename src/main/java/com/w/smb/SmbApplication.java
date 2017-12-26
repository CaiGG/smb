package com.w.smb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.w.smb.mapping")
public class SmbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmbApplication.class, args);
	}
}
