package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.UserDto;
import com.gdgtoledo.dockerkata.userservice.model.User;

@Component
public class UserMapper {

    public UserDto UserToUserDto(User user) {

        return null;
    }

    public User UserDtoToUser(UserDto userDto) {

        return null;
    }

    public Collection<UserDto> UserCollectionToUserDtoCollection(Collection<User> users)
    {
    	return null;
    }
}