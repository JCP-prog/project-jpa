/**
 * 
 */
package com.jimmyc.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.jimmyc.projectjpa.dao.DisqueraDAO;
import com.jimmyc.projectjpa.dao.impl.DisqueraDAOImpl;
import com.jimmyc.projectjpa.entity.Disquera;

/**
 * @author JimmyC
 *
 */
class DisqueraDAOImplTest {
	private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();
	/**
	 * Test method for {@link com.jimmyc.projectjpa.dao.impl.DisqueraDAOImpl#guardar(com.jimmyc.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {
		Disquera disquera = new Disquera();
		disquera.setDescripcion("Elektrik");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);
		
		this.disqueraDAO.guardar(disquera);
		
	}

	/**
	 * Test method for {@link com.jimmyc.projectjpa.dao.impl.DisqueraDAOImpl#actualizar(com.jimmyc.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarById(9l);
		disqueraConsultada.setDescripcion("Disquera IronMaiden");
		this.disqueraDAO.actualizar(disqueraConsultada);
	}

	/**
	 * Test method for {@link com.jimmyc.projectjpa.dao.impl.DisqueraDAOImpl#eliminar(com.jimmyc.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		Long id = 17l;
		
		this.disqueraDAO.eliminar(id);
	}

	/**
	 * Test method for {@link com.jimmyc.projectjpa.dao.impl.DisqueraDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<Disquera> disquerasConsultadas = this.disqueraDAO.consultar();
		
		assertTrue(disquerasConsultadas.size() > 0);
		
		disquerasConsultadas.forEach(disquera -> {
			System.out.println("Disquera: " + disquera.getDescripcion());
		});
	}

	/**
	 * Test method for {@link com.jimmyc.projectjpa.dao.impl.DisqueraDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(17L);
		System.out.println("Disquera: "+disquera.getDescripcion());
	}

}
