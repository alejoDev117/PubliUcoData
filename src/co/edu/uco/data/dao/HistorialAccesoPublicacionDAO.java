package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.HistorialAccesoPublicacionEntity;

public interface HistorialAccesoPublicacionDAO {
	
	void create(HistorialAccesoPublicacionEntity entity);
	
	List<HistorialAccesoPublicacionEntity> read(HistorialAccesoPublicacionEntity entity);
	
	void delete(HistorialAccesoPublicacionEntity entity);
	
	
}
