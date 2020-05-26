package com.management.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@SuppressWarnings("unused")
public class DBConfiguration {
	private String driverClassName;
	private String url;
	private String username;
	private String password;

	@Profile("dev")
	@Bean
	public String devDatabaseConnection() {
		System.out.println("DB Connection for DEV Mysql");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection for DEV Mysql";
		}
	
	@Profile("test")
	@Bean
	public String testDatabaseConnection() {
		System.out.println("DB Connection to RDS_TEST Low Cost Test instance");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection to RDS_TEST Low Cost Test instance";
		}
	
	@Profile("prod")
	@Bean
	public String prodDatabaseConnection() {
		System.out.println("DB Connection to RDS_PROD High Perormance Test instance");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection to RDS_PROD High Perormance Test instance";
		}
}
