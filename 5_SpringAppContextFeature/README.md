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