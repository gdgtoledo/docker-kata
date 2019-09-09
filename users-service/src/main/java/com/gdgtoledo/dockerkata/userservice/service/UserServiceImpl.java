package com.gdgtoledo.dockerkata.userservice.service;

import com.gdgtoledo.dockerkata.userservice.model.Address;
import com.gdgtoledo.dockerkata.userservice.model.Phone;
import com.gdgtoledo.dockerkata.userservice.model.User;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    /* (non-Javadoc)
     * @see com.gdgtoledo.dockerkata.userservice.service.UserService#getUserById(java.lang.String)
     */
    @Override
    public User getUserById(String id) {
        return new User();
    }

    /* (non-Javadoc)
     * @see com.gdgtoledo.dockerkata.userservice.service.UserService#getAllUser()
     */
    @Override
    public Set<User> getAllUser() {
        return null;
    }

    /* (non-Javadoc)
     * @see com.gdgtoledo.dockerkata.userservice.service.UserService#getAllAddressesByUserId(java.lang.String)
     */
    @Override
    public Set<Address> getAllAddressesByUserId(String id) {
        return null;
    }

    /* (non-Javadoc)
     * @see com.gdgtoledo.dockerkata.userservice.service.UserService#getAllPhonesByUserId(java.lang.String)
     */
    @Override
    public Set<Phone> getAllPhonesByUserId(String id) {
        return null;
    }
}
