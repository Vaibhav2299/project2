package com.nacre.fb.serviceimpl;

import java.io.PrintWriter;

import com.nacre.fb.bo.RegistrationBo;
import com.nacre.fb.daoimpl.RegistrationDaoImpl;
import com.nacre.fb.delegates.RegistrationDelegates;
import com.nacre.fb.dto.RegistrationDto;
import com.nacre.fb.servicei.IRegistrationService;

public class RegistrationServiceImpl implements IRegistrationService {

	// local declaration
	
	RegistrationDelegates registrationDelegates = null;
	RegistrationBo registrationBo = null;
	RegistrationDaoImpl registrationDaoImpl = null;
	
	@Override
	public boolean register(RegistrationDto registrationDto) {

		if (registrationDto.getAge() < 18)
			return false;
		else
			// creating bo object
		registrationBo = new RegistrationBo();

		registrationBo.setfName(registrationDto.getfName());
		registrationBo.setlName(registrationDto.getlName());
		registrationBo.setEmail(registrationDto.getEmail());
		registrationBo.setDob(registrationDto.getDob());
		registrationBo.setAge(registrationDto.getAge());
		registrationBo.setPer(registrationDto.getPer());
		registrationBo.setGender(registrationDto.getGender());

		// creating dao object
		
		registrationDaoImpl=new RegistrationDaoImpl();
		registrationDaoImpl.insert(registrationBo);
	
		return true;
	}

}
