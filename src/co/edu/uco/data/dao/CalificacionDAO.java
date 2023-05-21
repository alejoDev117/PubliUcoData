package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.CalificacionEntity;



public interface CalificacionDAO {

	void create(CalificacionEntity entity);
	
	List<CalificacionEntity> read(CalificacionEntity entity);
	
	void update(CalificacionEntity entity);
}
