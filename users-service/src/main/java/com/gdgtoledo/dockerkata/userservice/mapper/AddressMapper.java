package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.AddressDto;
import com.gdgtoledo.dockerkata.userservice.model.Address;

@Component
public class AddressMapper {
	
	public AddressDto AddressToAddressDto(Address address) {

        return null;
    }

    public Address AddressDtoToAddress(AddressDto addressDto) {

        return null;
    }
    
    public Collection<AddressDto> AddressCollectionToAddressDtoCollection(Collection<Address> addresses)
    {
    	return null;
    }
}