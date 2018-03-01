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