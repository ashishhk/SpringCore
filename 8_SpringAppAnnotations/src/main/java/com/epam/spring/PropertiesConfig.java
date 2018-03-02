package com.epam.spring;

import java.beans.BeanProperty;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesConfig {

	@Bean
	@BeanProperty
	public PropertyPlaceholderConfigurer propertyPlaceholderConfigurer() {
		return new PropertyPlaceholderConfigurer();
	}
	
	<bean class="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer">
	<property name="locations">
		<list>
			<value>classpath:client1.properties</value>
			<value>classpath:client2.properties</value>
		</list>
	</property>
	<property name="ignoreResourceNotFound" value="true"/>
	<property name="systemPropertiesMode">
		<util:constant
			static-field="org.springframework.beans.factory.config.PropertyPlaceholderConfigurer.SYSTEM_PROPERTIES_MODE_OVERRIDE" />
	</property>
</bean>
}
