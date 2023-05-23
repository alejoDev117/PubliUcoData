package co.edu.uco.data.dao.factory.relational.sqlServer;

import java.sql.Connection;

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

	@Override
	public EstadoLectorDAO getEstadoLectorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoObservacionRevisionDAO getEstadoObservacionRevisorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoPlanDAO getEstadoPlanDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoPreferenciaDAO getEstadoPreferenciaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoPublicacionDAO getEstadoPublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoRevisionDAO getEstadoRevisionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoRevisorDAO getEstadoRevisorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoSuscripcionDAO getEstadoSuscripcionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoTipoAccesoDAO getEstadoTipoAccesoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoTipoEscritorDAO getEstadoTipoEscritorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoTipoIdentificacionDAO getEstadoTipoIdentificacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoVersionDAO getEstadoVersionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RespuestaDAO getRespuestaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoComentarioRevisorDAO getTipoComentarioRevisorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoReporteDAO getTipoReporteDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoRevisionDAO getTipoRevisionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoAccesoDAO getTipoAccesoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoEscritorDAO getTipoEscritorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoIdentificacionDAO getTipoIdentificacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdministradorCategoriaDAO getAdministradorCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriaDAO getCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EscritorDAO getEscritorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LectorDAO getLectorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RevisorDAO getRevisorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoriaAdministradorCategoriaDAO getCategoriaAdministradorCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PerfilDAO getPerfilDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanCategoriaDAO getPlanCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PublicacionDAO getPublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CalificacionDAO getCalificacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComentarioLectorDAO getComentarioLectorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EscritorPublicacionDAO getEscritorPublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HistorialAccesoPublicacionDAO getHistorialAccesoPublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PalabraClavePublicacionDAO getPalabraClavePublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanPublicacionDAO getPlanPublicacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreferenciaCategoriaDAO getPreferenciaCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreferenciaEscritorDAO getPreferenciaEscritorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SuscripcionCategoriaDAO getSuscripcionCategoriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VersionDAO getVersionDAO() {
		// TODO Auto-generated method stub
		return null;
	}


	
}


