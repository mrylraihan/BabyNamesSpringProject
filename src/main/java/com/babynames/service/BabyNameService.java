package com.babynames.service;

import java.util.List;

import com.babynames.dto.BabyNameDTO;
import com.babynames.exception.BabyNameException;

public interface BabyNameService {
	public List<BabyNameDTO> getAllBabyName() throws BabyNameException;
	public List<BabyNameDTO> getBabyNameByGender(String gender) throws BabyNameException;
	public BabyNameDTO addBabyName(BabyNameDTO babyNameDTO) throws BabyNameException;
	
}
