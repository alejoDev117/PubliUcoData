package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.PreferenciaCategoriaEntity;

public interface PreferenciaCategoriaDAO {
	
	void create(PreferenciaCategoriaEntity entity);
	
	List<PreferenciaCategoriaEntity> read(PreferenciaCategoriaEntity entity);
	
	void update(PreferenciaCategoriaEntity entity);
	
	void delete(PreferenciaCategoriaEntity entity);
	
	
}
