package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.UserDto;
import com.gdgtoledo.dockerkata.userservice.model.User;

@Component
public class UserMapper {
	
	@Autowired
	private AddressMapper addressMapper;
	@Autowired
	private PhoneMapper phoneMapper;

    public UserDto userToUserDto(User user) {
    	UserDto userDto = new UserDto();
    	userDto.setUserId(user.getUserId());
    	userDto.setName(user.getName());
    	userDto.setSurname(user.getSurname());
    	userDto.setBirthdate(user.getBirthdate());
        return userDto;
    }

    public Set<UserDto> userSetToUserDtoSet(Set<User> users)
    {
    	return null;
    }
}