package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.PhoneDto;
import com.gdgtoledo.dockerkata.userservice.model.Phone;

@Component
public class PhoneMapper {
	
	public PhoneDto PhoneToPhoneDto(Phone phone) {

        return null;
    }

    public Phone PhoneDtoToPhone(PhoneDto phoneDto) {

        return null;
    }
    
    public Collection<PhoneDto> PhoneCollectionToPhoneDtoCollection(Collection<Phone> phones)
    {
    	return null;
    }
}
