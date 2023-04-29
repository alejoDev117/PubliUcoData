package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.EstadoTipoRelacionInstitucionEntity;

public interface EstadoTipoRelacionInstitucionDAO {
	
	void create(EstadoTipoRelacionInstitucionEntity entity);
	
	List<EstadoTipoRelacionInstitucionEntity> read(EstadoTipoRelacionInstitucionEntity entity);
	
	void update(EstadoTipoRelacionInstitucionEntity entity);
	
	void delete(EstadoTipoRelacionInstitucionEntity entity);
	
	
}
