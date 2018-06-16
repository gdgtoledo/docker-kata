package com.gdgtoledo.dockerkata.userservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;

@Entity
public class User {

    @Id
    private String userId;
    private String name;
    private String surname;
    private Instant birthdate;

}