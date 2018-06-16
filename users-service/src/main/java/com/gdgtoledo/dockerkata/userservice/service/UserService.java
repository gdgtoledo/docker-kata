package com.gdgtoledo.dockerkata.userservice.service;

import java.util.Collection;

import com.gdgtoledo.dockerkata.userservice.model.Address;
import com.gdgtoledo.dockerkata.userservice.model.Phone;
import com.gdgtoledo.dockerkata.userservice.model.User;


public interface UserService {

	User getUserById(String id);

	Collection<User> getAllUser();

	Collection<Address> getAllAddressesByUserId(String id);

	Collection<Phone> getAllPhonesByUserId(String id);

}