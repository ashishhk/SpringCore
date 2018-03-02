#README 3
#Scope And Inner Class
by default all beans are singleton and returning new object each time requires scope to set as prototype

scope for web applications
Request
Session
Global-sessions

#Inner Bean
defination of bean inside the constructor-arg tag
name of bean is not required
can be created but not be addressed
visibility is only where it is defined
cannot be reused

Why required?- 


#Factory Method
bean tag has a argument as factory-method for static calls such as for DateFormat method getDateTimeInstance

#README 4 
#Initialize and Destroy

#init-method
	an argument in bean arg
	no arguments
	any accesss modifier
	can return something or exception
	
	Flows
	create all the dependent bean to inject them
	calls the constructor of the bean passing all the parameters
	assigns all the different properties
	calls the init-method 
	
	not hardcode the filename in code and instead on spring.xml
	
	
#Cache FileEvent Logger
	create new layer of cache to write in to file and keep cache size configurable 
	use
	
#issue 
	when program terminates before reaching to full cache size
#Solution
	1) Spring maintains objects in container and manages lifecycle 
	2) Destroy method in Spring configuration file