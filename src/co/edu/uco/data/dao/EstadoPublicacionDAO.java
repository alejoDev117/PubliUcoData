package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.EstadoPublicacionEntity;

public interface EstadoPublicacionDAO {

	void create(EstadoPublicacionEntity entity);
	
	List<EstadoPublicacionEntity> read(EstadoPublicacionEntity entity);
}
