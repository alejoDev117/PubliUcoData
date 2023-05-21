package co.edu.uco.data.dao;

import java.util.List;




import co.edu.uco.entities.EscritorEntity;




public interface EscritorDAO {
	
	void create(EscritorEntity entity);
	
	List<EscritorEntity> read(EscritorEntity entity);
	
	void update(EscritorEntity entity);
	
	void delete(EscritorEntity entity);
	
	
}
