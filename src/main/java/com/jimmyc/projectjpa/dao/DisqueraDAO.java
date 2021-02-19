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
}
