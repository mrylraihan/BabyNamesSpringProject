package com.babynames.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.babynames.dto.BabyNameDTO;
import com.babynames.entity.BabyNameEntity;
import com.babynames.exception.BabyNameException;
import com.babynames.repository.BabyNameRepository;

@Service(value = "babyNameService")
@Transactional
public class BabyNameServiceImpl implements BabyNameService{
	
	@Autowired
	private BabyNameRepository babyNameRepository;
	
	@Override
	public List<BabyNameDTO> getAllBabyName() throws BabyNameException {
		Iterable<BabyNameEntity> babyNames = babyNameRepository.findAll();
		List<BabyNameDTO> resList = new ArrayList<BabyNameDTO>();
		
		for(BabyNameEntity b : babyNames) {
			resList.add(BabyNameDTO.entityToDTO(b));
		}
		if(resList.isEmpty()) {
			throw new BabyNameException("BabyNameService.BABY_NAME_NOT_FOUND");
		}
		
		return resList;
	}

	@Override
	public List<BabyNameDTO> getBabyNameByGender(String gender) throws BabyNameException {
		List<BabyNameEntity> babyNames = babyNameRepository.getBabyNameByGender(gender);
		if (babyNames.isEmpty()) {
			throw new BabyNameException("BabyNameService.BABY_NAME_NOT_FOUND");
			
		}
		List<BabyNameDTO> resList = new ArrayList<BabyNameDTO>();
		
		for (BabyNameEntity b: babyNames) {
			resList.add(BabyNameDTO.entityToDTO(b));
			
		}
		return resList;
	}

	@Override
	public BabyNameDTO addBabyName(BabyNameDTO babyNameDTO) throws BabyNameException {
		BabyNameEntity babyName = BabyNameDTO.dtoEntity(babyNameDTO);
		babyName = babyNameRepository.save(babyName);
		babyNameDTO.setBabyNameId(babyName.getBabyNameId());
		return babyNameDTO;
	}

}
