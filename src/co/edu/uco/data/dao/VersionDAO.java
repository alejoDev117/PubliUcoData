package co.edu.uco.data.dao;

import java.util.List;

import co.edu.uco.entities.EstadoTipoRelacionInstitucionEntity;
import co.edu.uco.entities.VersionEntity;

public interface VersionDAO {
	
	void create(VersionEntity entity);
	
	List<VersionEntity> read(VersionEntity entity);
	
	void update(VersionEntity entity);
	
	void delete(VersionEntity entity);
	
	
}
