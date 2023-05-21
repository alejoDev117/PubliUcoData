package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.EstadoLectorEntity;

public interface EstadoLectorDAO {

	void create(EstadoLectorEntity entity);
	
	List<EstadoLectorEntity> read(EstadoLectorEntity entity);
}
