package com.sonata.DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


public class DbConnection {
	
	Connection connection;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobtracker","root","732595@Ki");
			
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException s) {
			System.out.println(s);
		}
		return connection;
	}
	
	public void closeConnection() {
		try {
			if(connection !=null) {
				connection.close();
			}
		}catch(SQLException sqle) {
			sqle.printStackTrace();
		}
	}

}
