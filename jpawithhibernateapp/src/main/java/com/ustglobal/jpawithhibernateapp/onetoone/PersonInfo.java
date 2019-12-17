package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="person_info")
public class PersonInfo {
    @Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	
}
