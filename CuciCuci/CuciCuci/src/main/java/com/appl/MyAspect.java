package com.appl;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MyAspect {

	@Before("execution(* com.appl.Main.*(..))")
	public void before() {
		System.out.println("\nSELAMAT DATANG!!!!!!!!\n");
	}
}
