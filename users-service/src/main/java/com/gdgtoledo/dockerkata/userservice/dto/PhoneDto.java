package com.gdgtoledo.dockerkata.userservice.dto;

import lombok.*;

@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDto {

    private String phoneNumber;
    private String company;
    private String type;

}