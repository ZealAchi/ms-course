package com.padre.hrconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrConfigServerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HrConfigServerApplication.class, args);
	}

}
