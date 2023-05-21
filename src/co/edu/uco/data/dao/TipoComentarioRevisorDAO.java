package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.TipoComentarioRevisorEntity;

public interface TipoComentarioRevisorDAO {

	void create(TipoComentarioRevisorEntity entity);
	
	List<TipoComentarioRevisorEntity> read(TipoComentarioRevisorEntity entity);
}
