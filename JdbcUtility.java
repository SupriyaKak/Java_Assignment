package com.cybage.connection;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


public class JdbcUtility {

public static Connection gtConnection() throws ClassNotFoundException,SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/NewDatabase","root","root");
	return connection;
}

}