package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.EstadoRevisorEntity;

public interface EstadoRevisorDAO {

	void create(EstadoRevisorEntity entity);
	
	List<EstadoRevisorEntity> read(EstadoRevisorEntity entity);
}
