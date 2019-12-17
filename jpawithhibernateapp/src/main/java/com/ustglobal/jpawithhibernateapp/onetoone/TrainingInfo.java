package com.ustglobal.jpawithhibernateapp.onetoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "traininginfo")
public class TrainingInfo {
     @Id
	@Column
	private int tid;
	@Column
	private String trainingType;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="Train_person",joinColumns=@JoinColumn(name="tid"),
	            inverseJoinColumns = @JoinColumn(name="id"))
	private List<PersonInfo> p1;
	
}
