package com.gdgtoledo.dockerkata.userservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;

@Entity
public class User {

    @Id
    private String userId;
    private String name;
    private String surname;
    private Instant birthdate;

    @OneToMany
    Set<Address> address;
    @OneToMany
    Set<Phone> phone;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Instant getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Instant birthdate) {
        this.birthdate = birthdate;
    }

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }

    public Set<Phone> getPhone() {
        return phone;
    }

    public void setPhone(Set<Phone> phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getUserId(), user.getUserId()) &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getSurname(), user.getSurname()) &&
                Objects.equals(getBirthdate(), user.getBirthdate()) &&
                Objects.equals(getAddress(), user.getAddress()) &&
                Objects.equals(getPhone(), user.getPhone());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getUserId(), getName(), getSurname(), getBirthdate(), getAddress(), getPhone());
    }
}