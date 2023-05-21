package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.EstadoPreferenciaEntity;

public interface EstadoPreferenciaDAO {

	void create(EstadoPreferenciaEntity entity);
	
	List<EstadoPreferenciaEntity> read(EstadoPreferenciaEntity entity);
}
