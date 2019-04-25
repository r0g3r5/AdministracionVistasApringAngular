package com.myapps.vista_admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({ "classpath:data_source.properties" })
public class VistaAdminRepositoryStartApp {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(VistaAdminRepositoryStartApp.class, args);
	}

}
