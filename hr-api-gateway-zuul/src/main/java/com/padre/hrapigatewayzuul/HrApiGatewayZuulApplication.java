package com.padre.hrapigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HrApiGatewayZuulApplication {
public static void main(String[] args) throws Exception {
	SpringApplication.run(HrApiGatewayZuulApplication.class, args);
}

}
