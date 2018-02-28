package com.epam.spring;

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
    	App app = new App();
    	app.client=new Client("1","Ashish Dadhore");
    	app.eventLogger= new ConsoleEventLogger();
    	
    	app.logEvent("Event for user 1");
        
    }
}
