package com.ashokit.usermgmt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.usermgmt.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
