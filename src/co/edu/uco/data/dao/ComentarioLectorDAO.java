package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.ComentarioLectorEntity;


public interface ComentarioLectorDAO {
	
	void create(ComentarioLectorEntity entity);
	
	List<ComentarioLectorEntity> read(ComentarioLectorEntity entity);
	
	void update(ComentarioLectorEntity entity);
	
	void delete(ComentarioLectorEntity entity);
	
	
}
