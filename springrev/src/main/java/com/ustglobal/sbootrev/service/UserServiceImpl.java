package com.ustglobal.sbootrev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.sbootrev.dto.Medicines;
import com.ustglobal.sbootrev.dto.Users;
import com.ustglobal.sbootrev.repo.MedicinesRepo;
import com.ustglobal.sbootrev.repo.UsersRepo;
@Service
public class UserServiceImpl implements UsersService{

	
	@Autowired
	private UsersRepo repo;
	@Autowired
	private MedicinesRepo mrepo;
	@Override
	public boolean addUsers(Users users) {
		repo.save(users);
		return true;
	}
	@Override
	public boolean login(Users users) {
		 Users user = repo.findByEmail(users.getEmail());
	        if(user == null) {
	            throw new RuntimeException("User does not exist.");
	        }
	        if(!user.getPassword().equals(users.getPassword())){
	            throw new RuntimeException("Password mismatch.");
	        }
	        return true;

	    }
	@Override
	public boolean addMedicines(Medicines medicine) {
		mrepo.save(medicine);
		return true;
	}
	@Override
	public Medicines getMedicines(String name) {
		
	Medicines med = mrepo.findByName(name);
	return med;
	
		
	}
	@Override
	public boolean deleteMedicineById(int id) {
		mrepo.deleteById(id);
		return true;
	}
	@Override
	public boolean deleteMedicineByName(String name) {
		mrepo.deleteByName(name);
		return true;
	}
	@Override
	public Medicines getMedicinesById(int id) {
		
		return mrepo.findById(id).get();
	}
	@Override
	public boolean updateMedicines(Medicines medicines) {
		mrepo.update(medicines.getId(), medicines.getName(), medicines.getQuantity(),medicines.getPrice());
		return true;
	}
	@Override
	public List<Medicines> getAllMedicines() {
		
		return mrepo.findAll();
	}
	
}

