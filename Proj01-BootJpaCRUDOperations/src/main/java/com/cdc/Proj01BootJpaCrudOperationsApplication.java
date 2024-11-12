package com.cdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.cdc.entity.Doctor;
import com.cdc.service.IDoctorService;

@SpringBootApplication
public class Proj01BootJpaCrudOperationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Proj01BootJpaCrudOperationsApplication.class, args);
		IDoctorService service = ctx.getBean("doctorService", IDoctorService.class);
		try {
			Doctor doctor = new Doctor();
			doctor.setDocName("Varun");
			doctor.setDocSpecialization("Cardio");
			doctor.setDocIncome(9900000.00);
			String resultMsg = service.registerDoctor(doctor);
			System.out.println(resultMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
