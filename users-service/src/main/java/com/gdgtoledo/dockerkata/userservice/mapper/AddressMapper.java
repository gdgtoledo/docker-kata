package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.AddressDto;
import com.gdgtoledo.dockerkata.userservice.model.Address;

@Component
public class AddressMapper {
	
	public AddressDto addressToAddressDto(Address address) {
		AddressDto addressDto = new AddressDto();
		addressDto.setCity(address.getCity());
		addressDto.setNumber(address.getNumber());
		addressDto.setStreet(address.getStreet());
		addressDto.setZip(address.getZip());
		return addressDto;
    }
    
    public Set<AddressDto> addressSetToAddressDtoSet(Set<Address> addresses)
    {
    	Set<AddressDto> addressesDto = new TreeSet<AddressDto>();
    	for (Address address : addresses) {
			addressesDto.add(this.addressToAddressDto(address));
		}
    	return addressesDto;
    }
}