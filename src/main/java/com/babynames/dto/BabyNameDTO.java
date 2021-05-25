package com.babynames.dto;

import com.babynames.entity.BabyNameEntity;

public class BabyNameDTO {

	private Integer babyNameId;
	
	private String babyName;
	
	private String gender;
	
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
	
	public static BabyNameEntity dtoEntity(BabyNameDTO dto) {
		BabyNameEntity entity = new BabyNameEntity();
		entity.setBabyNameId(dto.getBabyNameId());
		entity.setBabyName(dto.getBabyName());
		entity.setGender(dto.getGender());
		entity.setMeaning(dto.getMeaning());
		return entity;
	}
	public static BabyNameDTO entityToDTO(BabyNameEntity entity) {
		BabyNameDTO dto = new BabyNameDTO();
		dto.setBabyNameId(entity.getBabyNameId());
		dto.setBabyName(entity.getBabyName());
		dto.setGender(entity.getGender());
		dto.setMeaning(entity.getMeaning());
		return dto;
		
	}
	
}
