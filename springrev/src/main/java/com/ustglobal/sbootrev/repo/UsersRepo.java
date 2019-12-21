package com.ustglobal.sbootrev.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ustglobal.sbootrev.dto.Users;

public interface UsersRepo extends JpaRepository<Users, Integer>{



	Users findByEmail(String email);

	
	
	
}
