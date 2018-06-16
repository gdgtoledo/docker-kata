package com.gdgtoledo.dockerkata.userservice.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.Instant;
import java.util.Objects;

@Entity
public class Phone {

    private String number;

    @ManyToOne
    private User user;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return Objects.equals(getNumber(), phone.getNumber()) &&
                Objects.equals(getUser(), phone.getUser());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNumber(), getUser());
    }

}