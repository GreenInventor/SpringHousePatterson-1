package house.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import house.beans.House;

/**
 * 
 * @author Tanner Patterson - tpatterson4@dmacc.edu
 * @version
 * Mar 29, 2022
 */
@Configuration
public class BeanConfiguration
{
	@Bean
	public House house()
	{
		House bean = new House();
		return bean;
	}
}
