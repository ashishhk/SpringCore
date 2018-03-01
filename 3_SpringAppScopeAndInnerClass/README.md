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