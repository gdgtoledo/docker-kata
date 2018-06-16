package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.UserDto;
import com.gdgtoledo.dockerkata.userservice.model.User;

@Component
public class UserMapper {

    public UserDto UserToUserDto(User user) {

        return UserDto.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .surname(user.getSurname())
                .build();
    }

    public User UserDtoToUser(UserDto userDto) {

        return User.builder()
                .userId(userDto.getUserId())
                .name(userDto.getName())
                .surname(userDto.getSurname())
                .build();
    }

    public Collection<UserDto> UserCollectionToUserDtoCollection(Collection<User> users)
    {
    	return null;
    }
}