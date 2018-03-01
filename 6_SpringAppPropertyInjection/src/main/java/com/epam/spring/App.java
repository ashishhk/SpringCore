package com.epam.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private Client client;
    
    private EventLogger eventLogger;
    
    public void logEvent(Event event) {
    	event.setMsg(event.getMsg().replaceAll(client.getId(), client.getFullName()));
    	eventLogger.logEvent(event);
    }
    
    public static void main( String[] msg)
    {
    	ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    	App app = (App) ctx.getBean("app");   
    	
    	Event event1=(Event) ctx.getBean("event");
    	event1.setMsg("Event for user 1");
    	event1.setType(EventType.INFO);
    	app.logEvent(event1);
    	
    	Event event2=(Event) ctx.getBean("event");
    	event2.setMsg("Event for user 2");
    	event2.setType(EventType.ERROR);
    	app.logEvent(event2);
    	
    	Event event3=(Event) ctx.getBean("event");
    	event3.setMsg("Event for user 3");
    	app.logEvent(event2);
    	
    	ctx.close();
    }

	public App(Client client, EventLogger eventLogger) {
		this.client = client;
		this.eventLogger = eventLogger;
	}
}
