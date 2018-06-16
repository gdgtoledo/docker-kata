package com.gdgtoledo.dockerkata.userservice.client;

import com.gdgtoledo.dockerkata.userservice.model.Phone;
import feign.RequestLine;
import org.springframework.stereotype.Component;

import java.util.Set;

public interface PhoneClient {

    @RequestLine("GET /{userId}")
    Set<Phone> getPhones(String userId);

}