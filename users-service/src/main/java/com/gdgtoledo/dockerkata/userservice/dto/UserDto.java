package com.gdgtoledo.dockerkata.userservice.dto;

import java.time.Instant;
import java.util.Set;

public class UserDto {

    private String userId;
    private String name;
    private String surname;
    private Instant birthdate;

    Set<AddressDto> address;
    Set<PhoneDto> phone;

}