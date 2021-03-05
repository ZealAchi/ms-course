package com.padre.hreurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HrEurekaServerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HrEurekaServerApplication.class, args);
	}

}
