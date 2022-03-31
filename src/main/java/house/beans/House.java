package house.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * 
 * @author Tanner Patterson - tpatterson4@dmacc.edu
 * @version
 * Mar 29, 2022
 */
@Data
@Entity
public class House
{
	@Id
	@GeneratedValue
	private long id;
	
	private int bedrooms;
	private int bathrooms;
	private int sqft;
	private int acres;
	private int garages;
	
	private double price;
	
	private String location;
	private String agent;
}
