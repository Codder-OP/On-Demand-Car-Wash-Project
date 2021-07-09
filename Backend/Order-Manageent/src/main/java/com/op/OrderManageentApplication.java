package com.op;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class OrderManageentApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManageentApplication.class, args);
	}

}
