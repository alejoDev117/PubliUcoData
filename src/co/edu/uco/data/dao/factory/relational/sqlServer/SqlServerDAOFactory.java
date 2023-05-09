package co.edu.uco.data.dao.factory.relational.sqlServer;

import java.sql.Connection;

import co.edu.uco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.data.dao.factory.DAOFactory;
import co.edu.uco.data.dao.relational.sqlserver.EstadoTipoRelacionInstitucionSqlServerDAO;
import co.edu.uco.data.dao.relational.sqlserver.TipoRelacionInstitucionSqlServerDAO;

public final class SqlServerDAOFactory extends DAOFactory {
	
	
	private Connection connection;
	
	public SqlServerDAOFactory() {
		openConnection();
	}

	@Override
	protected final void openConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  final void closeConnection() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void startTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmTransaction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelTransaction() {
		// TODO Auto-generated method stub
	}


	@Override
	public EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO() {
		return new EstadoTipoRelacionInstitucionSqlServerDAO(connection);
	}

	@Override
	public TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {

		return new TipoRelacionInstitucionSqlServerDAO(connection);
	}


	
}


