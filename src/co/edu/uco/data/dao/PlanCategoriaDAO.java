package co.edu.uco.data.dao;

import java.util.List;


import co.edu.uco.entities.PlanCategoriaEntity;



public interface PlanCategoriaDAO {
	
	void create(PlanCategoriaEntity entity);
	
	List<PlanCategoriaEntity> read(PlanCategoriaEntity entity);
	
	void update(PlanCategoriaEntity entity);
	
	void delete(PlanCategoriaEntity entity);
	
	
}
