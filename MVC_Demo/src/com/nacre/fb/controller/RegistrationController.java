package com.nacre.fb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nacre.fb.delegates.RegistrationDelegates;
import com.nacre.fb.vo.RegistrationVo;


@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// local variable declaration
	
		String fName=null;
		String lName=null;
		String email=null;
		String dob=null;
		String age=null;
		String per=null;
		String gender=null;
		boolean flag=false;
		PrintWriter out=null;
		RegistrationVo registrationVo=null;
		RegistrationDelegates registrationDelegates=null;
		
		
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		//accepting parameter		
		
		fName=request.getParameter("fname");
		lName=request.getParameter("lname");
		email=request.getParameter("email");
		dob=request.getParameter("dob");
		age=request.getParameter("age");
		per=request.getParameter("per");
		gender=request.getParameter("gender");
		
		
		//creating RegistrationVo object
		registrationVo =new RegistrationVo();
		
		//setting  to Registrationvo
		registrationVo.setfName(fName);
		registrationVo.setlName(lName);
		registrationVo.setEmail(email);
		registrationVo.setDob(dob);
		registrationVo.setGender(gender);
		registrationVo.setAge(age);
		registrationVo.setPer(per);
		
		//sending to delegates
		registrationDelegates=new RegistrationDelegates();
		
		flag=registrationDelegates.parse(registrationVo);
		
		//setContentType
		response.setContentType("text/html");
		
		//creating printWriter object
		out=response.getWriter();
				
		out.println("<html>");
		out.println("<body bgcolor='cyan'>");
		if(flag==true){
			out.println("<h3>Registration successfull..<h3>");
		}else{
			
			out.println("<h3>Registration failed...<h3>");
		}
		out.println("</body>");
		out.println("</html>");
	
	}

}
