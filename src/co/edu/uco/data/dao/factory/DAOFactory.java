package co.edu.uco.data.dao.factory;

import co.edu.uco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.data.dao.Factory;
import co.edu.uco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.data.dao.factory.relational.postgresql.PostgresSqlDAOFactory;
import co.edu.uco.data.dao.factory.relational.sqlServer.SqlServerDAOFactory;


public abstract class DAOFactory {
	
	public static DAOFactory getFactory(final Factory factory) {
		
		DAOFactory daoFactory;
		
		
		switch(factory) {
		
		
		case SQLSERVER:{
			daoFactory = new SqlServerDAOFactory();
			break;
		}
		
		case POSTGRESQL:{
			daoFactory = new PostgresSqlDAOFactory();
			break;
		}
		default:
			throw new IllegalArgumentException("Not implemented yet!");
		
		}
		
		return daoFactory;
	
	}
	
	protected abstract void openConnection();
	
	public abstract void closeConnection();
	
	public abstract void startTransaction();
	
	public abstract void confirmTransaction();
	
	public abstract void cancelTransaction();
	
	
	public abstract EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO();
	
	public abstract TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO();
	

}
