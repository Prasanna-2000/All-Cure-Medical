package com.gl.MedicalShopUsers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MedicalShopUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalShopUsersApplication.class, args);
		System.out.println("#5");
	}

}
