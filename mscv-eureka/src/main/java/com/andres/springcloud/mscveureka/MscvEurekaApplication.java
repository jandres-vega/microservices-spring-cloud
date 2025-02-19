package com.andres.springcloud.mscveureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MscvEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscvEurekaApplication.class, args);
	}

}
