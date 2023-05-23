package co.edu.uco.data.dao.factory.relational.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.uco.compuconnect.data.dao.RespuestaDAO;
import co.edu.uco.compuconnect.data.dao.TipoIdentificacionDAO;
import co.edu.uco.crosscutting.exceptions.PubliucoCrossCuttingException;
import co.edu.uco.crosscutting.exceptions.PubliucoDataException;
import co.edu.uco.crosscutting.exceptions.PubliucoException;
import co.edu.uco.crosscutting.utils.Messages.UtilsqlMessages;
import co.edu.uco.crosscutting.utils.UtilSql;
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


public final class PostgresSqlDAOFactory extends DAOFactory{
	
	private Connection connection;
	
	public PostgresSqlDAOFactory() {
		openConnection();
	}

	@Override
	protected void openConnection() {
		try { 
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/publiuco", "postgres", "admin");
			UtilSql.connectionIsOpen(connection);
			System.out.println("Connected");
		}catch (final PubliucoException exception) {
			throw exception;
		}catch (IllegalArgumentException exception) {
			var userMessage = UtilsqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilsqlMessages.CONNECTION_IS_OPEN_TECHNICAL_ILEGAL_ARGUMENT_EXCEPTION;
			
			throw PubliucoDataException.create(userMessage, technicalMessage, exception);
		}
		catch (final NullPointerException exception) {
			var userMessage = UtilsqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilsqlMessages.CONNECTION_IS_OPEN_TECHNICAL_NULL_POINTER_EXCEPTION;
			
			throw PubliucoDataException.create(userMessage, technicalMessage, exception);
		}catch (final Exception exception) {
			var userMessage = UtilsqlMessages.CONNECTION_IS_OPEN_USER_MESSAGE;
			var technicalMessage = UtilsqlMessages.CONNECTION_IS_OPEN_TECHNICAL_EXCEPTION;
			
			throw PubliucoDataException.create(userMessage, technicalMessage, exception);
	}
	}

	@Override
	public void closeConnection() {
		try {
			UtilSql.closeConnection(connection);
		}catch (final PubliucoException exception) {	
			throw exception;
		}
	}

	@Override
	public void startTransaction() {
		try {
			UtilSql.connectionIsOpen(connection);
			connection.setAutoCommit(false);
		}catch (final PubliucoException exception) {
				throw exception;
		}catch(final SQLException exception) {
			var userMessage = UtilsqlMessages.COMMIT_IS_STARTING_USER_MESSAGE;
			var technicalMessage = UtilsqlMessages.COMMIT_TECHNICAL_SQL_EXCEPTION;
			
			throw PubliucoCrossCuttingException.create(userMessage, technicalMessage, exception);
		}
	}

	@Override
	public void confirmTransaction() {

		try {
			UtilSql.initCommitIsReady(connection);
			connection.commit();
		}catch(PubliucoException exception){
			throw exception;
		}catch(SQLException exception){
			var userMessage = UtilsqlMessages.CONFIRM_COMMIT_USER_MESSAGE;
			var technicalMessage = UtilsqlMessages.COMMIT_TECHNICAL_SQL_EXCEPTION;
			
			throw PubliucoCrossCuttingException.create(userMessage, technicalMessage, exception);
		}
	}

	@Override
	public void cancelTransaction() {
		try {
			UtilSql.initCommitIsReady(connection);
			connection.rollback();
		}catch(PubliucoException exception){
			throw exception;
		}catch(SQLException exception){
			var userMessage = UtilsqlMessages.CANCEL_COMMIT_USER_MESSAGE;
			var technicalMessage = UtilsqlMessages.COMMIT_TECHNICAL_SQL_EXCEPTION;
			
			throw PubliucoCrossCuttingException.create(userMessage, technicalMessage, exception);
		}
	}

	@Override
	public EstadoTipoRelacionInstitucionDAO getEstadoTipoRelacionInstitucionDAO() {
		return null;
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
	public TipoRelacionInstitucionDAO getTipoRelacionInstitucionDAO() {
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
