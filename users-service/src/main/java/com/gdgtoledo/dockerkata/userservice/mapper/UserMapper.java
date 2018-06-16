package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.UserDto;
import com.gdgtoledo.dockerkata.userservice.model.User;

@Component
public class UserMapper {
<<<<<<< HEAD
=======

    public UserDto userToUserDto(User user) {
        return UserDto.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .surname(user.getSurname())
                .build();
    }

    public User userDtoToUser(UserDto userDto) {
        return User.builder()
                .userId(userDto.getUserId())
                .name(userDto.getName())
                .surname(userDto.getSurname())
                .build();
    }
	

>>>>>>> 621b5a62f3a1f15b5388f6b9b0932b6d1eccf20c

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