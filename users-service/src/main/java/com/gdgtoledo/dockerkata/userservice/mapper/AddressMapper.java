package com.gdgtoledo.dockerkata.userservice.mapper;

import com.gdgtoledo.dockerkata.userservice.dto.AddressDto;
import com.gdgtoledo.dockerkata.userservice.model.Address;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.TreeSet;

@Component
public class AddressMapper {

    public AddressDto addressToAddressDto(Address address) {
        return AddressDto.builder()
                .city(address.getCity())
                .number(address.getNumber())
                .street(address.getStreet())
                .zip(address.getZip())
                .build();
    }

    public Set<AddressDto> addressSetToAddressDtoSet(Set<Address> addresses) {
        Set<AddressDto> addressesDto = new TreeSet<>();

        addresses.forEach(a -> addressesDto.add(this.addressToAddressDto(a)));

        return addressesDto;
    }
}