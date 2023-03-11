package com.ormtiago.ormtiago.Country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ormtiago.ormtiago.Country.CountryEntity;


@Repository
public interface CountryEntityRepository extends JpaRepository<CountryEntity, String>{

}
