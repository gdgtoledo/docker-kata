package com.gdgtoledo.dockerkata.userservice.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
@Data
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private String userId;
    private String name;
    private String surname;
    private Instant birthdate;

}