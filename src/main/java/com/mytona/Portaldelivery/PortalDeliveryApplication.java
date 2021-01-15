package com.mytona.Portaldelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PortalDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalDeliveryApplication.class, args);
	}

}
