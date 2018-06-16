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
import java.util.HashSet;
import java.util.Set;

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
        when(userService.getAllAddressesByUserId(any())).thenReturn(new HashSet<Address>(Arrays.asList(new Address("street", Integer.valueOf(0), "city", "zip"))));
        when(userService.getAllPhonesByUserId(any())).thenReturn(new HashSet<Phone>(Arrays.asList(new Phone("phoneNumber", "company", "type"))));
        when(userMapper.userToUserDto(any())).thenReturn(new UserDto("userId", "name", "surname", null, new HashSet<AddressDto>(Arrays.asList(new AddressDto("street", Integer.valueOf(0), "city", "zip"))), new HashSet<PhoneDto>(Arrays.asList(new PhoneDto("phoneNumber", "company", "type")))));
        when(phoneMapper.phoneSetToPhoneDtoSet(any())).thenReturn(new HashSet<PhoneDto>(Arrays.asList(new PhoneDto("phoneNumber", "company", "type"))));
        when(addressMapper.addressSetToAddressDtoSet(any())).thenReturn(new HashSet<AddressDto>(Arrays.asList(new AddressDto("street", Integer.valueOf(0), "city", "zip"))));

        UserDto result = userController.getUserById("id");
        Assert.assertEquals(new UserDto("userId", "name", "surname", null, new HashSet<AddressDto>(Arrays.asList(new AddressDto("street", Integer.valueOf(0), "city", "zip"))), new HashSet<PhoneDto>(Arrays.asList(new PhoneDto("phoneNumber", "company", "type")))), result);
    }

    @Test
    public void testGetAllUser() throws Exception {
        when(userService.getAllUser()).thenReturn(new HashSet<User>(Arrays.asList(new User("userId", "name", "surname", null))));
        when(userMapper.userSetToUserDtoSet(any())).thenReturn(new HashSet<UserDto>(Arrays.asList(new UserDto("userId", "name", "surname", null, new HashSet<AddressDto>(Arrays.asList(new AddressDto("street", Integer.valueOf(0), "city", "zip"))), new HashSet<PhoneDto>(Arrays.asList(new PhoneDto("phoneNumber", "company", "type")))))));

        Set<UserDto> result = userController.getAllUser();
        Assert.assertEquals(new HashSet<UserDto>(Arrays.asList(new UserDto("userId", "name", "surname", null, new HashSet<AddressDto>(Arrays.asList(new AddressDto("street", Integer.valueOf(0), "city", "zip"))), new HashSet<PhoneDto>(Arrays.asList(new PhoneDto("phoneNumber", "company", "type")))))), result);
    }

    @Test
    public void testGetAllAddressesByUserId() throws Exception {
        when(userService.getAllAddressesByUserId(any())).thenReturn(new HashSet<Address>(Arrays.asList(new Address("street", Integer.valueOf(0), "city", "zip"))));
        when(addressMapper.addressSetToAddressDtoSet(any())).thenReturn(new HashSet<AddressDto>(Arrays.asList(new AddressDto("street", Integer.valueOf(0), "city", "zip"))));

        Set<AddressDto> result = userController.getAllAddressesByUserId("id");
        Assert.assertEquals(new HashSet<AddressDto>(Arrays.asList(new AddressDto("street", Integer.valueOf(0), "city", "zip"))), result);
    }

    @Test
    public void testGetAllPhonesByUserId() throws Exception {
        when(userService.getAllPhonesByUserId(any())).thenReturn(new HashSet<Phone>(Arrays.asList(new Phone("phoneNumber", "company", "type"))));
        when(phoneMapper.phoneSetToPhoneDtoSet(any())).thenReturn(new HashSet<PhoneDto>(Arrays.asList(new PhoneDto("phoneNumber", "company", "type"))));

        Set<PhoneDto> result = userController.getAllPhonesByUserId("id");
        Assert.assertEquals(new HashSet<PhoneDto>(Arrays.asList(new PhoneDto("phoneNumber", "company", "type"))), result);
    }
}
