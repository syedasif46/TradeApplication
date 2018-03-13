package com.tradeapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages= {"com.*"})
@EnableDiscoveryClient
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanDefinitionNames);
			List beanNames = Arrays.asList(beanDefinitionNames);
			System.out.println("Printing bean names");
			beanNames.forEach(System.out::println);
		};
	}
}
