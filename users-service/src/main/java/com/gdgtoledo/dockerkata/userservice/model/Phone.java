package com.gdgtoledo.dockerkata.userservice.model;

import lombok.*;

@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Phone {

    private String phoneNumber;
    private String company;
    private String type;

}