package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.TipoAccesoEntity;


public interface TipoAccesoDAO {

	void create(TipoAccesoEntity entity);
	
	List<TipoAccesoEntity> read(TipoAccesoEntity entity);
	
	void update(TipoAccesoEntity entity);
}
