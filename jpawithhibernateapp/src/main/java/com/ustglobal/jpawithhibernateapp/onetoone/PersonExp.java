package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name ="personinfo")
public class PersonExp {
	@Id
	@Column
	private int ppid;
	@Column
	private String company_name;
	@Column
	private int year;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private PersonInfo p;
}
