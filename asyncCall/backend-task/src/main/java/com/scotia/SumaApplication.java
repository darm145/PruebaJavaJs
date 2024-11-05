package com.scotia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SumaApplication {
	public static void main(String[] args) {
        SpringApplication.run(SumaApplication.class, args);
    }
}
