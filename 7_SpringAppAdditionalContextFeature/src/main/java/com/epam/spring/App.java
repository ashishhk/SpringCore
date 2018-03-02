package com.epam.spring;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private Client client;
    
    private Map<EventType,EventLogger> eventLoggers;
    
    private EventLogger defaultLogger;
    
    public void logEvent(Event event) {
    	EventLogger eventLogger=eventLoggers.get(event.getType());
    	event.setMsg(event.getMsg().replaceAll(client.getId(), client.getFullName()));

    	if(null==eventLogger) {
    		eventLogger=defaultLogger;
    	}
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
    	app.logEvent(event3);
    	
    	ctx.close();
    }

	public App(Client client, Map<EventType, EventLogger> eventLogger, EventLogger defaultLogger) {
		this.client = client;
		this.eventLoggers = eventLogger;
		this.defaultLogger=defaultLogger;
	}
}
