package co.edu.uco.data.dao.factory.relational.postgresql;

import java.sql.Connection;

import co.edu.uco.crosscutting.utils.UtilSql;
import co.edu.uco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.data.dao.factory.DAOFactory;
import co.edu.uco.data.dao.relational.sqlserver.EstadoTipoRelacionInstitucionSqlServerDAO;
import co.edu.uco.data.dao.relational.sqlserver.TipoRelacionInstitucionSqlServerDAO;

public final class PostgresSqlDAOFactory extends DAOFactory{
	
	Connection connection;
	
	public PostgresSqlDAOFactory() {
		openConnection();
	}


	@Override
	protected final void openConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public final  void closeConnection() {
		UtilSql.closeConnection(connection);
		
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
	public final EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO() {
		return new EstadoTipoRelacionInstitucionSqlServerDAO(connection);
	}

	@Override
	public TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {
		return new TipoRelacionInstitucionSqlServerDAO(connection);
	}



}
