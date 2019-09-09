package com.gdgtoledo.dockerkata.userservice.model;

import lombok.*;

@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private Integer number;
    private String city;
    private String zip;

}