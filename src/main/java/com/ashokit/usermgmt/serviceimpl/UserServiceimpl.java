package com.ashokit.usermgmt.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.ashokit.usermgmt.entities.Loginform;
import com.ashokit.usermgmt.entities.Unlockaccountform;
import com.ashokit.usermgmt.entities.User;
import com.ashokit.usermgmt.repositories.UserRepo;
import com.ashokit.usermgmt.service.UserService;

public class UserServiceimpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public Map<Integer, String> getcountry() {
		
		
		
		return null;
	}

	@Override
	public Map<Integer, String> getState(Integer countryid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getcity(Integer stateid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String checkemail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String register(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unlockaccount(Unlockaccountform form) {

		return null;
	}

	@Override
	public String login(Loginform form) {

		return null;
	}

	@Override
	public String forgotpwd(String email) {

		return null;
	}

}
