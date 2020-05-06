package com.appl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		Main main = ctx.getBean("main", Main.class);
		main.menu();
		SpringApplication.run(Main.class, args);
		ctx.close();
	}
	
	public void menu() {
		System.out.println("MAU APA\n");
	}

}
