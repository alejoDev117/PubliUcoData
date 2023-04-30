package co.edu.uco.data.dao.relational.sqlserver;


import java.sql.Connection;
import java.util.List;

import co.edu.uco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.entities.EstadoTipoRelacionInstitucionEntity;

public final  class TipoRelacionInstitucionSqlServerDAO implements TipoRelacionInstitucionDAO{
	
	
	public TipoRelacionInstitucionSqlServerDAO(final Connection connection) {
		super();
	}

	@Override
	public void create(EstadoTipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EstadoTipoRelacionInstitucionEntity> read(EstadoTipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(EstadoTipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(EstadoTipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub
		
	}
	

}
