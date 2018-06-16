package com.gdgtoledo.dockerkata.userservice.controller;

import com.gdgtoledo.dockerkata.userservice.dto.AddressDto;
import com.gdgtoledo.dockerkata.userservice.dto.PhoneDto;
import com.gdgtoledo.dockerkata.userservice.dto.UserDto;
import com.gdgtoledo.dockerkata.userservice.mapper.AddressMapper;
import com.gdgtoledo.dockerkata.userservice.mapper.PhoneMapper;
import com.gdgtoledo.dockerkata.userservice.mapper.UserMapper;
import com.gdgtoledo.dockerkata.userservice.model.Address;
import com.gdgtoledo.dockerkata.userservice.model.Phone;
import com.gdgtoledo.dockerkata.userservice.model.User;
import com.gdgtoledo.dockerkata.userservice.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

import static org.mockito.Mockito.*;

public class UserControllerTest {
    @Mock
    UserService userService;
    @Mock
    UserMapper userMapper;
    @Mock
    PhoneMapper phoneMapper;
    @Mock
    AddressMapper addressMapper;
    @InjectMocks
    UserController userController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetUserById() throws Exception {
        when(userService.getUserById(any())).thenReturn(new User("userId", "name", "surname", null));
        when(userMapper.UserToUserDto(any())).thenReturn(new UserDto("userId", "name", "surname", null, new HashSet<AddressDto>(Arrays.asList(new AddressDto("street", Integer.valueOf(0), "city", "zip"))), new HashSet<PhoneDto>(Arrays.asList(new PhoneDto("number")))));

        UserDto result = userController.getUserById("id");
        Assert.assertEquals(new UserDto("userId", "name", "surname", null, new HashSet<AddressDto>(Arrays.asList(new AddressDto("street", Integer.valueOf(0), "city", "zip"))), new HashSet<PhoneDto>(Arrays.asList(new PhoneDto("number")))), result);
    }

    @Test
    public void testGetAllUser() throws Exception {
        when(userService.getAllUser()).thenReturn(Arrays.<User>asList(new User("userId", "name", "surname", null)));
        when(userMapper.UserCollectionToUserDtoCollection(any())).thenReturn(Arrays.<UserDto>asList(new UserDto("userId", "name", "surname", null, new HashSet<AddressDto>(Arrays.asList(new AddressDto("street", Integer.valueOf(0), "city", "zip"))), new HashSet<PhoneDto>(Arrays.asList(new PhoneDto("number"))))));

        Collection<UserDto> result = userController.getAllUser();
        Assert.assertEquals(Arrays.<UserDto>asList(new UserDto("userId", "name", "surname", null, new HashSet<AddressDto>(Arrays.asList(new AddressDto("street", Integer.valueOf(0), "city", "zip"))), new HashSet<PhoneDto>(Arrays.asList(new PhoneDto("number"))))), result);
    }

    @Test
    public void testGetAllAddressesByUserId() throws Exception {
        when(userService.getAllAddressesByUserId(any())).thenReturn(Arrays.<Address>asList(new Address("fullAddress")));
        when(addressMapper.AddressCollectionToAddressDtoCollection(any())).thenReturn(Arrays.<AddressDto>asList(new AddressDto("street", Integer.valueOf(0), "city", "zip")));

        Collection<AddressDto> result = userController.getAllAddressesByUserId("id");
        Assert.assertEquals(Arrays.<AddressDto>asList(new AddressDto("street", Integer.valueOf(0), "city", "zip")), result);
    }

    @Test
    public void testGetAllPhonesByUserId() throws Exception {
        when(userService.getAllPhonesByUserId(any())).thenReturn(Arrays.<Phone>asList(new Phone("phoneNumber", "company", "type")));
        when(phoneMapper.PhoneCollectionToPhoneDtoCollection(any())).thenReturn(Arrays.<PhoneDto>asList(new PhoneDto("number")));

        Collection<PhoneDto> result = userController.getAllPhonesByUserId("id");
        Assert.assertEquals(Arrays.<PhoneDto>asList(new PhoneDto("number")), result);
    }

}