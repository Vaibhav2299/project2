package com.nacre.fb.daoimpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nacre.fb.bo.RegistrationBo;
import com.nacre.fb.dto.RegistrationDto;
import com.nacre.fb.helper.RegistrationAbstractImpl;
import com.nacre.fb.util.DBConnection;

public class RegistrationDaoImpl extends RegistrationAbstractImpl {

	//  local declaration
	
	Connection con=null;
	PreparedStatement pst=null;
	int count=0;

	@Override
	public int insert(RegistrationBo registrationbo) {
	try {
		con=DBConnection.getConnection();
		if(con!=null) {
		pst=con.prepareStatement("insert into register(fname,lname,email,dob,age,per,gender) values(?,?,?,?,?,?,?)");
		pst.setString(1, registrationbo.getfName());
		pst.setString(2, registrationbo.getlName());
		pst.setString(3, registrationbo.getEmail());
		pst.setString(4, registrationbo.getDob());
		pst.setInt(5, registrationbo.getAge());
		pst.setDouble(6, registrationbo.getPer());
		pst.setString(7," "+registrationbo.getGender());
		
		count=pst.executeUpdate();
		}
	
	} catch (ClassNotFoundException e) {
	
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}	
		return count;
	}
}
