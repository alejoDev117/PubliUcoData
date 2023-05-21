package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.EstadoRevisionEntity;

public interface EstadoRevisionDAO {

	void create(EstadoRevisionEntity entity);
	
	List<EstadoRevisionEntity> read(EstadoRevisionEntity entity);
}
