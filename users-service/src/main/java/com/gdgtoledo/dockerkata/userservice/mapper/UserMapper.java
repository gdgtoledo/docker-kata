package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.UserDto;
import com.gdgtoledo.dockerkata.userservice.model.User;

@Component
public class UserMapper {

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