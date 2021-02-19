/**
 * 
 */
package com.jimmyc.projectjpa.dao;

import java.util.List;

import com.jimmyc.projectjpa.entity.Disquera;

/**
 * @author JimmyC
 * Interfaz que genera el DAO para las transacciones del CRUD a la tabla de Disquera
 */
public interface DisqueraDAO {
	void guardar(Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(Long id);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);
	
	/**
	 * Metodo que permite consultar con JPQL la disquera a partir de una descripcion.
	 * @param descripcion {@link String} descripcin de la disquera
	 * @return {@link Disquera} disquera consultada
	 */
	Disquera consultarByDescripcionJPQL(String descripcion);
	/**
	 * Metodo que permite consultar con SQL nativo la disquera a partir de una descripcion
	 * @param descripcion {@link String} descripcin de la disquera
	 * @return {@link Disquera} disquera consultada
	 */
	Disquera consultarByDescripcionNative(String descripcion);
	
}
