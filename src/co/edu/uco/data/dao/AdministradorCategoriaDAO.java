package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.AdministradorCategoriaEntity;



public interface AdministradorCategoriaDAO {

	void create(AdministradorCategoriaEntity entity);

	List<AdministradorCategoriaEntity> read(AdministradorCategoriaEntity entity);

	void update(AdministradorCategoriaEntity entity);

	void delete(AdministradorCategoriaEntity entity);

}
