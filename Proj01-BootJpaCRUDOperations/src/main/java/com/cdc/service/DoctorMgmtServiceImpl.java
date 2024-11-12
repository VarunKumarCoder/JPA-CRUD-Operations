package com.cdc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdc.entity.Doctor;
import com.cdc.repository.IDoctorRepo;

@Service("doctorService")
public class DoctorMgmtServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepo doctorRepo;

	@Override
	public String registerDoctor(Doctor doctor) {
		Doctor doc = doctorRepo.save(doctor);
		return "Doctor Object is saved with object ID" + doc.getDocId();
	}

}
