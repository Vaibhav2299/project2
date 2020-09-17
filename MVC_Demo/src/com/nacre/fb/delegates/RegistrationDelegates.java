package com.nacre.fb.delegates;

import com.nacre.fb.dto.RegistrationDto;
import com.nacre.fb.serviceimpl.RegistrationServiceImpl;
import com.nacre.fb.vo.RegistrationVo;

public class RegistrationDelegates {

	//local variable
	int age=0;
	double per=0.0;
	char gender=' ';
	RegistrationVo registrationVo=null;
	RegistrationDto registrationDto=null;
	RegistrationServiceImpl registrationServiceImpl=null; 
	boolean flag=false;
	
	//parsing operation
	public boolean parse(RegistrationVo registrationVo) {
		
		age=Integer.parseInt(registrationVo.getAge());
		per=Double.parseDouble(registrationVo.getPer());
		gender=registrationVo.getGender().charAt(0);
		
		//storing in registrationdto
		
		registrationDto=new RegistrationDto();
		
		registrationDto.setfName(registrationVo.getfName());
		registrationDto.setlName(registrationVo.getlName());
		registrationDto.setEmail(registrationVo.getEmail());
		registrationDto.setDob(registrationVo.getDob());
		registrationDto.setAge(age);
		registrationDto.setPer(per);
		registrationDto.setGender(gender);
		
		//creating registrationServiceImpl object
		
		registrationServiceImpl=new RegistrationServiceImpl();
		flag=registrationServiceImpl.register(registrationDto);
		
		return flag;	
	}	
	
}
