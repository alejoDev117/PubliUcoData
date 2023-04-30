package co.edu.uco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.util.List;

import co.edu.uco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionSqlServerDAO implements EstadoTipoRelacionInstitucionDAO  {
	
	
	public EstadoTipoRelacionInstitucionSqlServerDAO(final Connection connection) {
		super();
	}

	@Override
	public final void create(final EstadoTipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionEntity> read(final EstadoTipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public final void update(final EstadoTipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public final void delete(final EstadoTipoRelacionInstitucionEntity entity) {
		// TODO Auto-generated method stub
		
	}

}
