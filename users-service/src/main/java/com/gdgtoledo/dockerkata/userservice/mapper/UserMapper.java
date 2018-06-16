package com.gdgtoledo.dockerkata.userservice.mapper;

import com.gdgtoledo.dockerkata.userservice.dto.UserDto;
import com.gdgtoledo.dockerkata.userservice.model.User;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

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

    public Set<UserDto> userSetToUserDtoSet(Set<User> users)
    {
        Set<UserDto> usersDto = new HashSet<>();

    	for (User user : users) {
			usersDto.add(this.userToUserDto(user));
		}

        return usersDto;
    }

}