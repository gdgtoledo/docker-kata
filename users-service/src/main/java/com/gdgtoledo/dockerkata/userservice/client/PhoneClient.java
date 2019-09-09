package com.gdgtoledo.dockerkata.userservice.client;

import com.gdgtoledo.dockerkata.userservice.model.Phone;
import feign.Param;
import feign.RequestLine;

import java.util.Set;

public interface PhoneClient {

    @RequestLine("GET /{userId}")
    Set<Phone> getPhones(@Param("userId") String userId);

}