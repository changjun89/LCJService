package com.lcj.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
@EnableJpaAuditing // JPA Auditing Ȱ��ȭ
@SpringBootApplication
public class LcjServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LcjServiceApplication.class, args);
	}
	
}
