package com.ashokit.usermgmt.service;

import java.util.Map;

import com.ashokit.usermgmt.entities.Loginform;
import com.ashokit.usermgmt.entities.Unlockaccountform;
import com.ashokit.usermgmt.entities.User;

public interface UserService {
	
	public Map <Integer ,String> getcountry();
	
	public Map <Integer ,String> getState(Integer countryid);
	
	public Map <Integer ,String> getcity(Integer stateid);
	
	public String checkemail(String email);
	
	public String register(User user);
	
	public String unlockaccount(Unlockaccountform form);
	
	public String login(Loginform form);
	
	public String forgotpwd(String email);
	

}
