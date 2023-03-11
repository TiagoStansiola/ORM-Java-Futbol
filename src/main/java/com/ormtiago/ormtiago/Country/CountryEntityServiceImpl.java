package com.ormtiago.ormtiago.Country;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ormtiago.ormtiago.Country.CountryEntity;



@Service
public class CountryEntityServiceImpl implements CountryEntityService{

	
	@Autowired
	private CountryEntityRepository countryRepository;
	@Override
	public List<CountryEntity> listAllCountries() {
		
		return (List<CountryEntity>)countryRepository.findAll();
	}
	
	  

}
