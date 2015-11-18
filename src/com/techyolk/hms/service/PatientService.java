package com.techyolk.hms.service;

import java.util.List;

import com.techyolk.hms.model.Patient;

public interface PatientService {
	
	public void addPatient(Patient patient);

	public void updatePatient(Patient patient);

	public List<Patient> listPatients();

	public void getPatientById(int id);

	public void deletePatient(int id);
}
