package com.ashokit.usermgmt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.usermgmt.entities.CityMaster;

public interface CityRepo extends JpaRepository<CityMaster, Integer> {

}
