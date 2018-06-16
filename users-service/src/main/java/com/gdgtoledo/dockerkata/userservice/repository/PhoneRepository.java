package com.gdgtoledo.dockerkata.userservice.repository;

import com.gdgtoledo.dockerkata.userservice.model.Phone;

import java.util.Set;

public interface PhoneRepository {

    Set<Phone> getPhones(String userId);

}