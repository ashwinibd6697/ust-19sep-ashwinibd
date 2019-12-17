package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="person_other_info")
public class PersonOtherInfo {

	@Id
	@Column
	private int pid;
	@Column
	
	private String fatherName;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private PersonInfo person;
}
