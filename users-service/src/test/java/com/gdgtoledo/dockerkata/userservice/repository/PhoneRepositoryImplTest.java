package com.gdgtoledo.dockerkata.userservice.repository;

import com.gdgtoledo.dockerkata.userservice.model.Phone;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PhoneRepositoryImplTest {
    private PhoneRepositoryImpl phoneRepositoryImpl = new PhoneRepositoryImpl();

    @Test
    public void testGetPhones() throws Exception {
        Set<Phone> result = phoneRepositoryImpl.getPhones("userId");

        Assert.assertEquals(
                new HashSet<Phone>(Arrays.asList(
                        new Phone("phoneNumber", "company", "type"))),
                result);
    }

}