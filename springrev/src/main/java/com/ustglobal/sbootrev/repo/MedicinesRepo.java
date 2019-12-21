package com.ustglobal.sbootrev.repo;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.ustglobal.sbootrev.dto.Medicines;


@Transactional
public interface MedicinesRepo extends JpaRepository<Medicines, Integer>{

	Medicines findByName(String name);

	void deleteByName(String name);
 
	
	@Modifying
	@Query("update Medicines set name=:name,quantity=:q,price=:p where mid=:mid")
	void update (@Param("mid")int mid, @Param("name")String name,@Param("q")int quantity,@Param("p")int price);

}
