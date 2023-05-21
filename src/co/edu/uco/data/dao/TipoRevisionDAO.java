package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.TipoRevisionEntity;

public interface TipoRevisionDAO {

	void create(TipoRevisionEntity entity);
	
	List<TipoRevisionEntity> read(TipoRevisionEntity entity);
}
