#Property Injection
	1) First Constructor call and after properties intialized
	2) concrete value 
		<property name="" value =""..>
	3) inject other bean as property 
		A) <property name="" ref="bean"
		or 
		B) property name="">
			<bean class="" />
		</property>
	4) Injecting collections
		A) list or array
			<list>
				<value>...</value> Simple values
				<ref bean=""/>	other bean
				<bean class="..."> inner bean
			</list>
		B) set
			<set>
			..
			.
			</set>
		