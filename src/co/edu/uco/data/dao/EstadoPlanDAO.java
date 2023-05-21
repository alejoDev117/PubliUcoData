package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.EstadoLectorEntity;
import co.edu.uco.entities.EstadoPlanEntity;

public interface EstadoPlanDAO {

	void create(EstadoPlanEntity entity);
	
	List<EstadoPlanEntity> read(EstadoPlanEntity entity);
}
