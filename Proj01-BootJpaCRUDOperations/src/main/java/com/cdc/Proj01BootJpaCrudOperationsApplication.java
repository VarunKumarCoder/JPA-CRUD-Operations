package com.cdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cdc.service.IDoctorService;

@SpringBootApplication
public class Proj01BootJpaCrudOperationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Proj01BootJpaCrudOperationsApplication.class, args);
		IDoctorService service = ctx.getBean("doctorService", IDoctorService.class);

	}

}
