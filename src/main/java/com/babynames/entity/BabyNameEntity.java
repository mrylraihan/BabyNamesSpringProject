package com.babynames.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "baby_name")
public class BabyNameEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "baby_name_id")
	private Integer babyNameId;
	
	@Column(name= "baby_name")
	private String babyName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "meaning")
	private String meaning;

	public Integer getBabyNameId() {
		return babyNameId;
	}

	public void setBabyNameId(Integer babyNameId) {
		this.babyNameId = babyNameId;
	}

	public String getBabyName() {
		return babyName;
	}

	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	
}
