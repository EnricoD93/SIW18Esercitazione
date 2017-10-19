package persistence.dao;

import java.util.List;

import model.CorsoDiLaurea;

public interface CorsoDiLaureaDao {
	public void save(CorsoDiLaurea cdl); // Create

	public CorsoDiLaurea findByPrimaryKey(Long codice); // Retrieve

	public List<CorsoDiLaurea> findAll();

	public void update(CorsoDiLaureaDao cdl); // Update

	public void delete(CorsoDiLaureaDao cdl); // Delete
}
