package com.ashokit.usermgmt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.usermgmt.entities.CountryMaster;

public interface CountryRepo extends JpaRepository<CountryMaster, Integer>{

}
