package com.cdc.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.cdc.entity.Doctor;
import com.cdc.service.IDoctorService;

public class CrudRepoTestRunner implements CommandLineRunner {

	@Autowired
	private IDoctorService doctorService;

	@Override
	public void run(String... args) throws Exception {

		try {
			Doctor doctor = new Doctor();
			doctor.setDocName("Varun");
			doctor.setDocSpecialization("Cardio");
			doctor.setDocIncome(9900000.00);
			String resultMsg = doctorService.registerDoctor(doctor);
			System.out.println(resultMsg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
