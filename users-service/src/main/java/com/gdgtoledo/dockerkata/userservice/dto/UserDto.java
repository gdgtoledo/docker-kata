package com.gdgtoledo.dockerkata.userservice.dto;

import lombok.*;

import java.time.Instant;
import java.util.Set;

@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String userId;
    private String name;
    private String surname;
    private Instant birthdate;

    Set<AddressDto> address;
    Set<PhoneDto> phone;

}