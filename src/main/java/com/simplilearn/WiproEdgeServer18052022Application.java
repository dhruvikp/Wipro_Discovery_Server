package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WiproEdgeServer18052022Application {

	public static void main(String[] args) {
		SpringApplication.run(WiproEdgeServer18052022Application.class, args);
	}

}
