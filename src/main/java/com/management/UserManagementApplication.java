package com.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.management.controller.rest.AuthController;


//@ComponentScan(basePackages={"com.management","com.management.controller.rest","com.management.dao",
//		"com.management.model","com.management.payload.request","com.management.response",
//		"com.management.security","com.management.security.jwt","com.management.service"})
@SpringBootApplication
//@EntityScan("com.management")
@EnableJpaRepositories("com.management.dao")
//@ComponentScan(basePackages={"com.management.controller.rest"})
//@EnableProcessApplication 
@EnableAutoConfiguration
public class UserManagementApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
//		ApplicationContext applicationContext = SpringApplication.run(UserManagementApplication.class, args);
		SpringApplication.run(UserManagementApplication.class, args);

//		for (String name : applicationContext.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}
	}

}
