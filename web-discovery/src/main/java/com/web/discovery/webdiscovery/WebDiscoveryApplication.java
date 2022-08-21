package com.web.discovery.webdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WebDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebDiscoveryApplication.class, args);
	}

}
