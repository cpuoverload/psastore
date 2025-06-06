package com.psa.psastore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MallDemoApplication{
	public static void main(String[] args) {
		SpringApplication.run(MallDemoApplication.class, args);
	}
}
