package com.capgemini.HelloWorldServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class HelloWorldServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldServerApplication.class, args);
	}
}
