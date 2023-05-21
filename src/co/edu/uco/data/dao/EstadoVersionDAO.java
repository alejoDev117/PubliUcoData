package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.EstadoVersionEntity;

public interface EstadoVersionDAO {

	void create(EstadoVersionEntity entity);
	
	List<EstadoVersionEntity> read(EstadoVersionEntity entity);
}
