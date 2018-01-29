package main.java.com.listeners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

class MyContextListener implements ServletContextListener{
	Connection con;

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			MyConnectionI myCon = ()->{
				try {
					return DriverManager.getConnection("","","");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return null;
			};
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}