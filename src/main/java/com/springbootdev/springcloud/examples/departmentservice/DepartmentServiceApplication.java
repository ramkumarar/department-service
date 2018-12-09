package com.springbootdev.springcloud.examples.departmentservice;

import com.ulisesbocchio.jasyptspringboot.environment.StandardEncryptableEnvironment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.environment(new StandardEncryptableEnvironment())
				.sources(DepartmentServiceApplication.class).run(args);

		//SpringApplication.run(DepartmentServiceApplication.class, args);
	}
}
