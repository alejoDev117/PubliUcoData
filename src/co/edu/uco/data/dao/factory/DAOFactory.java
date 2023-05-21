package co.edu.uco.data.dao.factory;

import co.edu.uco.compuconnect.data.dao.RespuestaDAO;
import co.edu.uco.compuconnect.data.dao.TipoIdentificacionDAO;
import co.edu.uco.data.dao.AdministradorCategoriaDAO;
import co.edu.uco.data.dao.CalificacionDAO;
import co.edu.uco.data.dao.CategoriaAdministradorCategoriaDAO;
import co.edu.uco.data.dao.CategoriaDAO;
import co.edu.uco.data.dao.ComentarioLectorDAO;
import co.edu.uco.data.dao.EscritorDAO;
import co.edu.uco.data.dao.EscritorPublicacionDAO;
import co.edu.uco.data.dao.EstadoLectorDAO;
import co.edu.uco.data.dao.EstadoObservacionRevisionDAO;
import co.edu.uco.data.dao.EstadoPlanDAO;
import co.edu.uco.data.dao.EstadoPreferenciaDAO;
import co.edu.uco.data.dao.EstadoPublicacionDAO;
import co.edu.uco.data.dao.EstadoRevisionDAO;
import co.edu.uco.data.dao.EstadoRevisorDAO;
import co.edu.uco.data.dao.EstadoSuscripcionDAO;
import co.edu.uco.data.dao.EstadoTipoAccesoDAO;
import co.edu.uco.data.dao.EstadoTipoEscritorDAO;
import co.edu.uco.data.dao.EstadoTipoIdentificacionDAO;
import co.edu.uco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.data.dao.EstadoVersionDAO;
import co.edu.uco.data.dao.Factory;
import co.edu.uco.data.dao.HistorialAccesoPublicacionDAO;
import co.edu.uco.data.dao.LectorDAO;
import co.edu.uco.data.dao.PalabraClavePublicacionDAO;
import co.edu.uco.data.dao.PerfilDAO;
import co.edu.uco.data.dao.PlanCategoriaDAO;
import co.edu.uco.data.dao.PlanPublicacionDAO;
import co.edu.uco.data.dao.PreferenciaCategoriaDAO;
import co.edu.uco.data.dao.PreferenciaEscritorDAO;
import co.edu.uco.data.dao.PublicacionDAO;
import co.edu.uco.data.dao.RevisorDAO;
import co.edu.uco.data.dao.SuscripcionCategoriaDAO;
import co.edu.uco.data.dao.TipoAccesoDAO;
import co.edu.uco.data.dao.TipoComentarioRevisorDAO;
import co.edu.uco.data.dao.TipoEscritorDAO;
import co.edu.uco.data.dao.TipoRelacionInstitucionDAO;
import co.edu.uco.data.dao.TipoReporteDAO;
import co.edu.uco.data.dao.TipoRevisionDAO;
import co.edu.uco.data.dao.VersionDAO;
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
	
	public abstract EstadoLectorDAO getEstadoLectorDAO();
	
	public abstract EstadoObservacionRevisionDAO getEstadoObservacionRevisionDAO();
	
	public abstract EstadoPlanDAO getEstadoPlanDAO();
	
	public abstract EstadoPreferenciaDAO getEstadoPreferenciaDAO();
	
	public abstract EstadoPublicacionDAO getEstadoPublicacionDAO();
	
	public abstract EstadoRevisionDAO getEstadoRevisionDAO();
	
	public abstract EstadoRevisorDAO getEstadoRevisorDAO();
	
	public abstract EstadoSuscripcionDAO getEstadoSuscripcionDAO();
	
	public abstract EstadoTipoAccesoDAO getEstadoTipoAccesoDAO();
	
	public abstract EstadoTipoEscritorDAO getEstadoTipoEscritorDAO();
	
	public abstract EstadoTipoIdentificacionDAO getEstadoTipoIdentificacionDAO();
	
	public abstract EstadoVersionDAO getEstadoVersionDAO();
	
	public abstract RespuestaDAO getRespuestaDAO();
	
	public abstract TipoComentarioRevisorDAO getTipoComentarioRevisorDAO();
	
	public abstract TipoReporteDAO getTipoReporteDAO();
	
	public abstract TipoRevisionDAO getTipoRevisionDAO();
	
	public abstract TipoAccesoDAO getTipoAccesoDAO();
	
	public abstract TipoEscritorDAO getTipoEscritorDAO();
	
	public abstract TipoIdentificacionDAO getTipoIdentificacionDAO();
	
	public abstract AdministradorCategoriaDAO getAdministradorCategoriaDAO();
	
	public abstract CategoriaDAO getCategoriaDAO();
	
	public abstract EscritorDAO getEscritorDAO();
	
	public abstract LectorDAO getLectorDAO();
	
	public abstract RevisorDAO getRevisorDAO();
	
	public abstract CategoriaAdministradorCategoriaDAO getCategoriaAdministradorCategoriaDAO();
	
	public abstract PerfilDAO getPerfilDAO();
	
	public abstract PlanCategoriaDAO getPlanCategoriaDAO();
	
	public abstract PublicacionDAO getPublicacionDAO();
	
	public abstract CalificacionDAO getCalificacionDAO();
	
	public abstract ComentarioLectorDAO getComentarioLectorDAO();
	
	public abstract EscritorPublicacionDAO getEscritorPublicacionDAO();
	
	public abstract HistorialAccesoPublicacionDAO getHistorialAccesoPublicacionDAO();
	
	public abstract PalabraClavePublicacionDAO getPalabraClavePublicacionDAO();
	
	public abstract PlanPublicacionDAO getPlanPublicacionDAO();
	
	public abstract PreferenciaCategoriaDAO getPreferenciaCategoriaDAO();
	
	public abstract PreferenciaEscritorDAO getPreferenciaEscritorDAO();
	
	public abstract SuscripcionCategoriaDAO getSuscripcionCategoriaDAO();
	
	public abstract VersionDAO getVersionDAO();
	
	public abstract EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO();
	
	public abstract TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO();
	

}
