package com.gdgtoledo.dockerkata.userservice.service;

import com.gdgtoledo.dockerkata.userservice.model.Address;
import com.gdgtoledo.dockerkata.userservice.model.Phone;
import com.gdgtoledo.dockerkata.userservice.model.User;

import java.util.Set;


public interface UserService {

    User getUserById(String id);

    Set<User> getAllUser();

    Set<Address> getAllAddressesByUserId(String id);

    Set<Phone> getAllPhonesByUserId(String id);

}