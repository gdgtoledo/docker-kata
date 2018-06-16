package com.gdgtoledo.dockerkata.userservice.mapper;

import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Component;

import com.gdgtoledo.dockerkata.userservice.dto.PhoneDto;
import com.gdgtoledo.dockerkata.userservice.model.Phone;

@Component
public class PhoneMapper {
	
	public PhoneDto phoneToPhoneDto(Phone phone) {
		PhoneDto phoneDto = new PhoneDto();
		phoneDto.setPhoneNumber(phone.getPhoneNumber());
		phoneDto.setCompany(phone.getCompany());
		phoneDto.setType(phone.getType());
		return phoneDto;
    }
    
    public Set<PhoneDto> phoneSetToPhoneDtoSet(Set<Phone> phones)
    {
    	Set<PhoneDto> phonesDto = new TreeSet<PhoneDto>();
    	for (Phone phone : phones) {
			phonesDto.add(this.phoneToPhoneDto(phone));
		}
    	return phonesDto;
    }
}
