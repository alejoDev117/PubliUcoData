package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.TipoReporteEntity;

public interface TipoReporteDAO {

	void create(TipoReporteEntity entity);
	
	List<TipoReporteEntity> read(TipoReporteEntity entity);
}
