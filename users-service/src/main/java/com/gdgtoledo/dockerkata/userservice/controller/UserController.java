package com.gdgtoledo.dockerkata.userservice.controller;

import java.util.Collection;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gdgtoledo.dockerkata.userservice.dto.AddressDto;
import com.gdgtoledo.dockerkata.userservice.dto.PhoneDto;
import com.gdgtoledo.dockerkata.userservice.dto.UserDto;
import com.gdgtoledo.dockerkata.userservice.mapper.AddressMapper;
import com.gdgtoledo.dockerkata.userservice.mapper.PhoneMapper;
import com.gdgtoledo.dockerkata.userservice.mapper.UserMapper;
import com.gdgtoledo.dockerkata.userservice.service.UserService;

@RestController
@RequestMapping(path = "user/")
public class UserController 
{
	@Autowired
	private UserService userService;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private PhoneMapper phoneMapper;
	@Autowired
	private AddressMapper addressMapper;
	
	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	@ResponseBody
	public UserDto getUserById(@PathVariable("id") String id)
	{
		UserDto userDto = userMapper.userToUserDto(userService.getUserById(id));
//		userDto.setAddresses(addressMapper.addressSetToAddressDtoSet(userService.getAllAddressesByUserId(id)));
//		userDto.setPhones(phoneMapper.phoneSetToPhoneDtoSet(userService.getAllPhonesByUserId(id)));
		return userDto;
	}
	
	@RequestMapping(path = "all", method = RequestMethod.GET)
	@ResponseBody
	public Set<UserDto> getAllUser()
	{
		return userMapper.userSetToUserDtoSet(userService.getAllUser());
	}
	
	@RequestMapping(path = "{id}/address/all", method = RequestMethod.GET)
	@ResponseBody
	public Set<AddressDto> getAllAddressesByUserId(@PathVariable("id") String id)
	{
		return addressMapper.addressSetToAddressDtoSet(userService.getAllAddressesByUserId(id));
	}
	
	@RequestMapping(path = "{id}/phone/all", method = RequestMethod.GET)
	@ResponseBody
	public Set<PhoneDto> getAllPhonesByUserId(@PathVariable("id") String id)
	{
		return phoneMapper.phoneSetToPhoneDtoSet(userService.getAllPhonesByUserId(id));
	}
}
