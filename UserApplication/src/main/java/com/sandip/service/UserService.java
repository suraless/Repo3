package com.sandip.service;

import java.util.List;

import com.sandip.ui.model.User;
import com.sandip.ui.model.UserDto;

public interface UserService {
	
	public UserDto createUser(UserDto userDto) ;

	public List<User> getUsers();
		
		
	
	
	

}
