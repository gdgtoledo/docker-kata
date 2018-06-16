package com.gdgtoledo.dockerkata.userservice.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.Instant;
import java.util.Objects;

@Entity
public class Address {

    private String street;
    private Integer number;
    private String city;
    private String zip;

    @ManyToOne
    User user;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
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
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;

        return Objects.equals(street, address.street) &&
                Objects.equals(number, address.number) &&
                Objects.equals(city, address.city) &&
                Objects.equals(zip, address.zip) &&
                Objects.equals(user, address.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, city, zip, user);
    }

}