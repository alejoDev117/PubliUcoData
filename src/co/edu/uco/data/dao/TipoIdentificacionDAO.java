package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.TipoIdentificacionEntity;


public interface TipoIdentificacionDAO {

	void create(TipoIdentificacionEntity entity);
	
	List<TipoIdentificacionEntity> read(TipoIdentificacionEntity entity);
	
	void update(TipoIdentificacionEntity entity);
}
