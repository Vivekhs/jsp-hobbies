package main.java.com.listeners;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyContextListener implements ServletContextListener{
	//Connection con;

	
	@Override
	public void contextDestroyed(ServletContextEvent sevletContextListener) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {

		ServletContext application = event.getServletContext();
		application.setAttribute("connection", "Connection success");
		
	}
	
}