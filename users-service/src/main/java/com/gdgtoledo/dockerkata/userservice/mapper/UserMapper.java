package com.gdgtoledo.dockerkata.userservice.mapper;

import com.gdgtoledo.dockerkata.userservice.dto.UserDto;
import com.gdgtoledo.dockerkata.userservice.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserMapper {

    public UserDto UserToUserDto(User user) {

        return null;
    }

    public User UserDtoToUser(UserDto userDto) {

        return null;
    }

}