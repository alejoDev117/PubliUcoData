package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.EstadoTipoAccesoEntity;

public interface EstadoTipoAccesoDAO {

	void create(EstadoTipoAccesoEntity entity);
	
	List<EstadoTipoAccesoEntity> read(EstadoTipoAccesoEntity entity);
}
