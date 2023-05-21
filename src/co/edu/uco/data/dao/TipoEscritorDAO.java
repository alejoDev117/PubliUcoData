package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.TipoEscritorEntity;


public interface TipoEscritorDAO {

	void create(TipoEscritorEntity entity);
	
	List<TipoEscritorEntity> read(TipoEscritorEntity entity);
	
	void update(TipoEscritorEntity entity);
}
