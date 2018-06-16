package com.gdgtoledo.dockerkata.userservice.dto;

import lombok.*;

@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {

    private String street;
    private Integer number;
    private String city;
    private String zip;

}