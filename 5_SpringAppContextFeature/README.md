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

#README 5
#Context Feature
#bean Definition Inheritance
	its about inheriting defination but not class
		<bean..... parent="<anotherbeanId>" parent child relation ship between beans
		definition could be inheritted even if the class don't have parent-child relationship
	for abstract, add argument abstract="true"
		Bean is not instantiated by the container
		The class attribute can be missing
#Bean Dependency
	bean is initalized after the initialization of anotherBean
	depends-on="<anotherBeanId>" argument
	
#laxy Initialization
	<bean lazy-init="true" not initialized initialized getBean is called
	<beans default-lazy-init="true all beans under this will go by default to lazy initialization
#Multiple Context

	
	spring.Xml--->{logger.xml, Security.xml}

	<beans..>
		<import resource="<anotherConfigXML>"
	</beans>
	this is for readability purpose only , Spring will ultimately unite to one context
	
	
	parentContext & childContext
	ApplicationContext parent= new ClassPathXmlApplicationContext(XMLs); 
	ApplicationContext child= new ClassPathXmlApplicationContext(XMLs,parent);
	this way, 