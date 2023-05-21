package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.CategoriaAdministradorCategoriaEntity;


public interface CategoriaAdministradorCategoriaDAO {

	void create(CategoriaAdministradorCategoriaEntity entity);
	
	List<CategoriaAdministradorCategoriaEntity> read(CategoriaAdministradorCategoriaEntity entity);
	
	void delete(CategoriaAdministradorCategoriaEntity entity);
}
