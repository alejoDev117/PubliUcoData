package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.SuscripcionCategoriaEntity;

public interface SuscripcionCategoriaDAO {
	
	void create(SuscripcionCategoriaEntity entity);
	
	List<SuscripcionCategoriaEntity> read(SuscripcionCategoriaEntity entity);
	
	void update(SuscripcionCategoriaEntity entity);
	
	void delete(SuscripcionCategoriaEntity entity);
	
	
}
