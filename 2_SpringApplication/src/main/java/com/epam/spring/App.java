package com.epam.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private Client client;
    
    private ConsoleEventLogger eventLogger;
    
    public void logEvent(String msg) {
    	String message = msg.replaceAll(client.getId(), client.getFullName());
    	eventLogger.logEvent(message);
    }
    
    public static void main( String[] msg)
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	App app = (App) ctx.getBean("app");    	
    	app.logEvent("Event for user 1");
    	app.logEvent("Event for user 2");
    }

	public App(Client client, ConsoleEventLogger eventLogger) {
		this.client = client;
		this.eventLogger = eventLogger;
	}
}
