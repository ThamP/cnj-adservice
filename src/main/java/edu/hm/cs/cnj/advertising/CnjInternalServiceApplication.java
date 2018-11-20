package edu.hm.cs.cnj.advertising;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CnjInternalServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CnjInternalServiceApplication.class, args);
	}
	
}
