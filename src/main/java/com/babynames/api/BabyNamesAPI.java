package com.babynames.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.babynames.dto.BabyNameDTO;
import com.babynames.exception.BabyNameException;
import com.babynames.service.BabyNameService;

@CrossOrigin
@RestController
@RequestMapping(value="BabyNameAPI")
public class BabyNamesAPI {
	
	@Autowired
	private BabyNameService babyNameService;
	
	@GetMapping(value = "name")
	public ResponseEntity<List<BabyNameDTO>> getAll() throws BabyNameException{
		List<BabyNameDTO> babyNames = babyNameService.getAllBabyName();
		return new ResponseEntity<List<BabyNameDTO>>(babyNames, HttpStatus.OK);	
	}
	
	@GetMapping(value ="gender/{gender}")
	public ResponseEntity<List<BabyNameDTO>> getBabyNameByGender(@PathVariable String gender)throws BabyNameException{
		List<BabyNameDTO> babyNames = babyNameService.getBabyNameByGender(gender);
		return new ResponseEntity<List<BabyNameDTO>>(babyNames,HttpStatus.OK);
	}
	@PostMapping(value = "babyname")
	public ResponseEntity<BabyNameDTO> addBabyName(@RequestBody BabyNameDTO babyNameDTO) throws BabyNameException{
		BabyNameDTO dto = babyNameService.addBabyName(babyNameDTO);
		return new ResponseEntity<BabyNameDTO>(dto,HttpStatus.OK);
	}
	
}
