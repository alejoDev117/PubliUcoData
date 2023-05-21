package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.EstadoObservacionRevisorEntity;

public interface EstadoObservacionRevisionDAO {

	void create(EstadoObservacionRevisorEntity entity);
	
	List<EstadoObservacionRevisorEntity> read(EstadoObservacionRevisorEntity entity);
}
