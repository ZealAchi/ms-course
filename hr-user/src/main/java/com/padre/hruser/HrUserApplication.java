package com.padre.hruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrUserApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HrUserApplication.class, args);
	}

}
