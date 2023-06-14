package com.aya.cloud.export.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.aya.cloud.export"})
public class ExportPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExportPortalApplication.class, args);
	}

}
