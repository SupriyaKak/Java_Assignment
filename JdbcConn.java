package com.cybage.connection;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConn {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connection connection =JdbcUtility.gtConnection();
			Statement statement=connection.createStatement();
			System.out.println("Created DB Connection..");
			ResultSet resultSet=statement.executeQuery("select * from student");
			
			while(resultSet.next())
			{
				System.out.println("Id :" +resultSet.getInt(1));
				System.out.println("Name :" +resultSet.getString(2));
				System.out.println("Address :" +resultSet.getString(3));
			}

		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
