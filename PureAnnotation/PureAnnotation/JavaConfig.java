package com.technoelevate.PureAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.technoelevate.PureAnnotation", "com.technoelevate.ComponentTest" })
public class JavaConfig {

	@Bean
	public Address getStudentAddress() {
		return new Address();
	}
	
	@Bean
	public Student getStudent() {
		return new Student();
	}

}
