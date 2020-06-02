package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.modelo.Tarjeta;

public interface GenericDAO<T, ID>{
	
	public void create(T entity);

	public T read(ID id);

	public void update(T entity);

	public void delete(T entity);

	public List<T> find();

	public void deleteByID(ID id);

	public List<T> find(String[] attributes, String[] values);
	
	public List<T> find(String[] attributes, String[] values, String order, int index, int size);

	T buscar(String[] attributes, String[] values);

	List<T> findAll();
	
	//List<T> findAll();

//	List<T> find(String[] attributes, String[] values, String order, int index, int size);

	//public T buscar(String[] attributes, String[] values);

//	Tarjeta read(String id);

	

}
