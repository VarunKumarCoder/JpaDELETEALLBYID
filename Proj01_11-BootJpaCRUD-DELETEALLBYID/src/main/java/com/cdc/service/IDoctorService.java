package com.cdc.service;

import java.util.List;

import com.cdc.entity.Doctor;

public interface IDoctorService {
	public String registerDoctor(Doctor doctor);

	public String registerGroupOfDoctors(Iterable<Doctor> doctors);

	public boolean isCustomerAvailable(Integer id);

	public long fetchDoctorsCount();

	public Iterable<Doctor> showAllDoctors();

	public Iterable<Doctor> showAllDoctorsByIds(Iterable<Integer> ids);

	public Doctor showDoctorById(Integer id);

	public String updateDoctorIncomeById(Integer id, float hikePercentage);

	public String registerOrUpdateDoctor(Doctor doctor);

	public String deleteDoctorById(Integer id);

	public String deleteDoctor(Doctor doctor);

	public String removeDoctorsById(List<Integer> ids);
}
