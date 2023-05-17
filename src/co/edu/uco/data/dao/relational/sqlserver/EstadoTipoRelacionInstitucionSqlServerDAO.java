package co.edu.uco.data.dao.relational.sqlserver;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.uco.crosscutting.exceptions.PubliucoDataException;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilSql;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;
import co.edu.uco.data.dao.EstadoTipoRelacionInstitucionDAO;
import co.edu.uco.data.dao.relational.SqlDAO;
import co.edu.uco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionSqlServerDAO extends SqlDAO<EstadoTipoRelacionInstitucionEntity> implements EstadoTipoRelacionInstitucionDAO  {
	
	
	public EstadoTipoRelacionInstitucionSqlServerDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final EstadoTipoRelacionInstitucionEntity entity) {
		var sqlStatement = "INSERT INTO EstadoTipoRelacionInstitucion(identificador,nombre,descripcion) VALUES(?,?,?)";
		
		try(var preparedStatement = getConnection().prepareStatement(sqlStatement)) {
			
			preparedStatement.setObject(1,entity.getIdentificador());
			preparedStatement.setString(2, entity.getNombre());
			preparedStatement.setString(3, entity.getDescripcion());
			
			
			preparedStatement.executeUpdate();
			
			
		}catch(final SQLException exception) {
			var userMessage = "Se ha presentado un problema tratando de registrar la informacion del nuevo estado tipo relacion institucion...";
			var technicalMessage = "Se ha presentado un problema de tipo SqlException dentro del metodo create de la clase EstadoTipoRelacionInstitucionSqlDAO. Por favor valide la traza completa del error...";
	
			throw PubliucoDataException.create(technicalMessage,userMessage,exception);
		}catch(final Exception exception) {
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la informacion del nuevo estado tipo relacion institucion...";
			var technicalMessage = "Se ha presentado un problema no controlado de tipo SqlException dentro del metodo create de la clase EstadoTipoRelacionInstitucionSqlDAO. Por favor valide la traza completa del error...";
	
			throw PubliucoDataException.create(technicalMessage,userMessage,exception);
		}
			
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionEntity> read(final EstadoTipoRelacionInstitucionEntity entity) {
		
		var sqlStatemets = new StringBuilder();
		var parameters = new ArrayList<>();
		
		
		sqlStatemets.append(prepareSelect());
		sqlStatemets.append(prepareFrom());
		sqlStatemets.append(prepareWhere(entity, parameters));
		sqlStatemets.append(prepareOrderBy());
		
		try(var preparedStatement = getConnection().prepareStatement(sqlStatemets.toString())){
			
		}catch(SQLException exception) {
			
		}catch(Exception exception) {
			
		}
		
		return null;
	}

	@Override
	public final void update(final EstadoTipoRelacionInstitucionEntity entity) {
		var sqlStatement = "UPDATE EstadoTipoRelacionInstitucion SET nombre=?, descripcion=? WHERE indentificador=?";
		
		try(var preparedStatement = getConnection().prepareStatement(sqlStatement)) {
			
		
			preparedStatement.setString(1, entity.getNombre());
			preparedStatement.setString(2, entity.getDescripcion());
			preparedStatement.setObject(3,entity.getIdentificador());
			
			preparedStatement.executeUpdate();
			
			
		}catch(final SQLException exception) {
			var userMessage = "Se ha presentado un problema tratando de actualizar la informacion del  estado tipo relacion institucion...";
			var technicalMessage = "Se ha presentado un problema de tipo SqlException dentro del metodo update de la clase EstadoTipoRelacionInstitucionSqlDAO. Por favor valide la traza completa del error...";
	
			throw PubliucoDataException.create(technicalMessage,userMessage,exception);
		}catch(final Exception exception) {
			var userMessage = "Se ha presentado un problema inesperado tratando de actualizar la informacion del  estado tipo relacion institucion...";
			var technicalMessage = "Se ha presentado un problema no controlado de tipo SqlException dentro del metodo update de la clase EstadoTipoRelacionInstitucionSqlDAO. Por favor valide la traza completa del error...";
	
			throw PubliucoDataException.create(technicalMessage,userMessage,exception);
		}
	}

	@Override
	public final void delete(final EstadoTipoRelacionInstitucionEntity entity) {
		var sqlStatement = "DELETE FROM EstadoTipoRelacionInstitucion WHERE identificador = ?";
		
		try(var preparedStatement = getConnection().prepareStatement(sqlStatement)) {
			
		
			preparedStatement.setObject(1,entity.getIdentificador());
			
			preparedStatement.executeUpdate();
			
			
		}catch(final SQLException exception) {
			var userMessage = "Se ha presentado un problema tratando de eliminar la informacion del  estado tipo relacion institucion...";
			var technicalMessage = "Se ha presentado un problema de tipo SqlException dentro del metodo delete de la clase EstadoTipoRelacionInstitucionSqlDAO. Por favor valide la traza completa del error...";
	
			throw PubliucoDataException.create(technicalMessage,userMessage,exception);
		}catch(final Exception exception) {
			var userMessage = "Se ha presentado un problema inesperado tratando de eliminar la informacion del  estado tipo relacion institucion...";
			var technicalMessage = "Se ha presentado un problema no controlado de tipo SqlException dentro del metodo delete de la clase EstadoTipoRelacionInstitucionSqlDAO. Por favor valide la traza completa del error...";
	
			throw PubliucoDataException.create(technicalMessage,userMessage,exception);
		}
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador,nombre,descripcion ";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM EstadoTipoRelacionInstitucion ";
	}

	@Override
	protected final String prepareWhere(final EstadoTipoRelacionInstitucionEntity entity, List<Object> parameters) {
		
		final var where = new StringBuilder("");
		parameters = UtilObject.getDefault(parameters, new ArrayList<>());
		var setWhere = true;
		
		if(!UtilObject.isNull(entity)) {
			if(!UtilUUID.isDefault(entity.getIdentificador())) {
				parameters.add(entity.getIdentificador());
				where.append("WHERE identificador=? ");
				setWhere = false;
				}
			if(!UtilText.getUtilText().isEmpty(entity.getNombre())) {
				parameters.add(entity.getNombre());
				where.append(setWhere ? "WHERE " : "AND ").append("nombre=? ");
				setWhere = false;
			}
			if(!UtilText.getUtilText().isEmpty(entity.getDescripcion())) {
				parameters.add(entity.getDescripcion());
				where.append(setWhere ? "WHERE " : "AND ").append("descripcion LIKE %?% ");
			}
		}
		return where.toString();
	}

	@Override
	protected final String prepareOrderBy() {
		return "ORDER BY nombre ASC";	
		}


}
