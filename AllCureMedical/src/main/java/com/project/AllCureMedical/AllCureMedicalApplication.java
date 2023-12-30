package com.project.AllCureMedical;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class AllCureMedicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AllCureMedicalApplication.class, args);
		System.out.println("#6");
	}

}
