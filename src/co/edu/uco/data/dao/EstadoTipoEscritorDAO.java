package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.EstadoTipoEscritorEntity;

public interface EstadoTipoEscritorDAO {

	void create(EstadoTipoEscritorEntity entity);
	
	List<EstadoTipoEscritorEntity> read(EstadoTipoEscritorEntity entity);
}
