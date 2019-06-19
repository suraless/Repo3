package com.sandip.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sandip.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	
	//By default all the basic CRUD operations are already provided.
	//Custom methods needs to be added explicitly. 
	// Ex - findUserByEmailAddress
	
	UserEntity findByEmail(String email);

}
