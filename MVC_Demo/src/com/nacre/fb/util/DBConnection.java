package com.nacre.fb.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	private static String className;
	private static String url;
	private static String userName;
	private static String password;
	

	
	public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
		
		new DBConnection().readProperties();
		Class.forName(className);
		Connection con=DriverManager.getConnection(url,userName,password);
		
		return con;
	}
	
	public void readProperties() throws IOException {
		
		String fileName="com/nacre/fb/config/mysqldb.properties";
		
		InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream(fileName);
		Properties properties=new Properties();
		
		if(inputStream!=null) {
			properties.load(inputStream);
			className=properties.getProperty("className");
			url=properties.getProperty("url");
			userName=properties.getProperty("userName");
			password=properties.getProperty("password");
		}
	}
	
}
