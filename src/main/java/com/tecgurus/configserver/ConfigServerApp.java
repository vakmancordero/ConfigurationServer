package com.tecgurus.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity(debug = true)
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApp.class, args);
	}

}
