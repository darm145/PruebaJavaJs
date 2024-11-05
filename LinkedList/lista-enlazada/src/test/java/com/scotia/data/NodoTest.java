package com.scotia.data;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NodoTest {
	
	@Test
	public void testGetValor() {
		Nodo nodo=new Nodo(5);
		assertEquals(5,nodo.getValor(),"Debe guardar correctamente valor del nodo");
	}
	
	@Test
	public void testSetValor() {
		Nodo nodo=new Nodo(5);
		nodo.setValor(6);
		assertEquals(6,nodo.getValor(),"Debe actualizar correctamente valor del nodo");
	}
	
	@Test
	public void testGetSiguienteVacio() {
		Nodo nodo=new Nodo(5);
		assertNull(nodo.getSiguiente(),"Nodo siguiente deber ser null por defecto");
	}
	
	@Test
	public void testSetSiguienteNoNulo() {
		Nodo nodo=new Nodo(5);
		Nodo nuevoNodo = new Nodo(6);
		nodo.setSiguiente(nuevoNodo);
		assertNotNull(nodo.getSiguiente(),"Debe Guardar nodo siguiente y no puede ser null");
	}
	
	@Test
	public void testSetSiguiente() {
		Nodo nodo=new Nodo(5);
		Nodo nuevoNodo = new Nodo(6);
		nodo.setSiguiente(nuevoNodo);
		assertEquals(nuevoNodo,nodo.getSiguiente(),"Debe guardar nodo siguiente correctamente");
	}
	
	

}
