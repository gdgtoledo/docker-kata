package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Set;

import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.PhoneDto;
import com.gdgtoledo.dockerkata.userservice.model.Phone;

@Component
public class PhoneMapper {
	
	public PhoneDto phoneToPhoneDto(Phone phone) {

        return null;
    }

    public Phone phoneDtoToPhone(PhoneDto phoneDto) {

        return null;
    }
    
    public Set<PhoneDto> phoneSetToPhoneDtoSet(Set<Phone> phones)
    {
    	return null;
    }
}
