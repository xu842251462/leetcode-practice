package com.sincere.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//		ApplicationContext applicationContext=SpringApplication.run(Application.class, args);
//		String[] beans = applicationContext.getBeanDefinitionNames();
//		for(String bean: beans){
//			System.out.println(bean);
//		}
    }

}
