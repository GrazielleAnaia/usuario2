package com.grazielleanaia.usuario2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class Usuario2Application {

	public static void main(String[] args) {
		SpringApplication.run(Usuario2Application.class, args);
	}

}
