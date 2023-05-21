package co.edu.uco.data.dao;

import java.util.List;



import co.edu.uco.entities.PalabraClavePublicacionEntity;

public interface PalabraClavePublicacionDAO {
	
	void create(PalabraClavePublicacionEntity entity);
	
	List<PalabraClavePublicacionEntity> read(PalabraClavePublicacionEntity entity);

	
	void delete(PalabraClavePublicacionEntity entity);
	
	
}
