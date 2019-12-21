package com.ustglobal.sbootrev.service;

import java.util.List;

import com.ustglobal.sbootrev.dto.Medicines;
import com.ustglobal.sbootrev.dto.Users;

public interface UsersService {

	public boolean addUsers(Users users);
	public boolean login(Users users);
	
	public boolean addMedicines(Medicines medicine);
	
	public boolean deleteMedicineById(int id);
	public boolean deleteMedicineByName(String name);
	
	public Medicines getMedicines(String name);
	public Medicines getMedicinesById(int id);
	public List<Medicines> getAllMedicines();
	
	
	public boolean updateMedicines(Medicines medicines);
	
	
}
