package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.EstadoTipoIdentificacionEntity;

public interface EstadoTipoIdentificacionDAO {

	void create(EstadoTipoIdentificacionEntity entity);
	
	List<EstadoTipoIdentificacionEntity> read(EstadoTipoIdentificacionEntity entity);
}
