package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.EscritorPublicacionEntity;


public interface EscritorPublicacionDAO {

	void create(EscritorPublicacionEntity entity);
	
	List<EscritorPublicacionEntity> read(EscritorPublicacionEntity entity);
	
	void update(EscritorPublicacionEntity entity);
}
