package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
@EnableAutoConfiguration
public class DemoApplication  {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}
}
