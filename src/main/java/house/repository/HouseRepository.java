package house.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import house.beans.House;

/**
 * 
 * @author Tanner Patterson - tpatterson4@dmacc.edu
 * @version
 * Mar 29, 2022
 */
@Repository
public interface HouseRepository extends JpaRepository<House, Long>
{
	
}
