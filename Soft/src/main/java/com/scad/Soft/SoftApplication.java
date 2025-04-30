package com.scad.Soft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SoftApplication {
	public static void main(String[] args) {
		SpringApplication.run(SoftApplication.class, args);
	}
}