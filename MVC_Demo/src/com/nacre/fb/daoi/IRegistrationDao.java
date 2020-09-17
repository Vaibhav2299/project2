package com.nacre.fb.daoi;

import com.nacre.fb.bo.RegistrationBo;
import com.nacre.fb.dto.RegistrationDto;

public interface IRegistrationDao {

	public int insert(RegistrationBo registrationbo);
	public int update();
	public int delete();
}
