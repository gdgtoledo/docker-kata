package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.AddressDto;
import com.gdgtoledo.dockerkata.userservice.model.Address;

@Component
public class AddressMapper {
	
	public AddressDto addressToAddressDto(Address address) {

        return null;
    }

    public Address addressDtoToAddress(AddressDto addressDto) {

        return null;
    }
    
    public Set<AddressDto> addressSetToAddressDtoSet(Set<Address> addresses)
    {
    	return null;
    }
}