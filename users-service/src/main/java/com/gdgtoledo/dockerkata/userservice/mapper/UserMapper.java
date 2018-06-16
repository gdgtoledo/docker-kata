package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.UserDto;
import com.gdgtoledo.dockerkata.userservice.model.User;

@Component
public class UserMapper {

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
    	Set<UserDto> usersDto = new TreeSet<UserDto>();
    	for (User user : users) {
			usersDto.add(this.userToUserDto(user));
		}
    	return usersDto;
    }
}