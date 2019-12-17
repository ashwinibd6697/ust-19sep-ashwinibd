package com.ustglobal.jpawithhibernateapp.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;

@Data
@Entity
@Table(name="voterid")
public class VoterId {
	@Id
	@Column
	private int vid;
	@Column
	private String vname;
      @Exclude
     @OneToOne(mappedBy ="voterId" )
	
	private Person person;

}
