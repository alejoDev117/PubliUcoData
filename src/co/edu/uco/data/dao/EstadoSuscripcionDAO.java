package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.EstadoSuscripcionEntity;

public interface EstadoSuscripcionDAO {

	void create(EstadoSuscripcionEntity entity);
	
	List<EstadoSuscripcionEntity> read(EstadoSuscripcionEntity entity);
}
