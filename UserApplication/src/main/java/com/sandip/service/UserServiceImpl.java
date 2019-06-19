package com.sandip.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandip.Repository.UserRepository;
import com.sandip.entity.UserEntity;
import com.sandip.ui.model.User;
import com.sandip.ui.model.UserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		
		UserEntity storedUser = userRepo.findByEmail(userDto.getEmail());
		if(storedUser!=null)
				throw new RuntimeException("User Wuth Email Id Already exists");
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);
		UserEntity newUserEntity = userRepo.save(userEntity);
		UserDto newUserDto = new UserDto();
		BeanUtils.copyProperties(newUserEntity,newUserDto);
		
		return newUserDto;
	}
	
	public List<User> getUsers(){
		Iterable<UserEntity> userList = userRepo.findAll();
		return null;
}


}
