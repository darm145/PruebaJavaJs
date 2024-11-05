package com.scotia.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ListaEnlazadaTest {
	
	@Test
	public void testListaNuevaVacia() {
		ListaEnlazada lista = new ListaEnlazada();
		assertEquals(0,lista.tamaño(),"Lista recien creada no tiene elementos");
	}
	
	@Test
	public void testInsertarNodos() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregar(0);
		lista.agregar(1);
		lista.agregar(2);
		assertEquals(3,lista.tamaño(),"debe insertar correctamente la cantidad de elementos");
	}
	
	@Test
	public void testEliminarNodo() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregar(0);
		lista.agregar(1);
		lista.agregar(2);
		lista.eliminar(1);
		assertEquals(2,lista.tamaño(),"debe eliminar correctamente el elemento");
	}
	
	@Test
	public void testEliminarUnSoloNodo() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregar(0);
		lista.agregar(1);
		lista.agregar(2);
		lista.agregar(1);
		lista.eliminar(1);
		assertEquals(3,lista.tamaño(),"debe eliminar solo el primer nodo con el valor encontrado");
	}
	
	@Test
	public void testEliminarCabeza() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregar(0);
		lista.eliminar(0);
		assertEquals(0,lista.tamaño(),"debe eliminar el nodo si es cabeza");
	}
	
	@Test
	public void testEliminarCabezaMultiplesElementos() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregar(0);
		lista.agregar(1);
		lista.agregar(2);
		lista.agregar(3);
		lista.eliminar(0);
		assertEquals(3,lista.tamaño(),"debe eliminar el nodo si es cabeza y existen mas nodos");
	}
	
	@Test
	public void testBuscarValorExistente() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregar(0);
		lista.agregar(1);
		lista.agregar(2);
		assertEquals(true,lista.buscar(1),"debe retornar que si encontro el valor");
	}
	
	@Test
	public void testBuscarValorNoExistente() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregar(0);
		lista.agregar(0);
		lista.agregar(2);
		assertEquals(false,lista.buscar(1),"debe retornar que no encontro el valor");
	}
	
	@Test
	public void testBuscarValorExistenteMultiplesRegistros() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregar(0);
		lista.agregar(1);
		lista.agregar(2);
		lista.agregar(1);
		assertEquals(true,lista.buscar(1),"debe retornar que si encontro el valor con multiples registros");
	}
	
	@Test
	public void testObtenerConListaVacia() {
		ListaEnlazada lista = new ListaEnlazada();
		assertEquals("",lista.obtener(1),"lista vacia retorna cadena vacia sin posiciones");
	}
	
	@Test
	public void testObtenerElementoQueNoEstaEnLista() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregar(0);
		lista.agregar(1);
		lista.agregar(2);
		assertEquals("",lista.obtener(3),"lista sin el elemento retorna cadena vacia sin posiciones");
	}
	
	@Test
	public void testObtenerElementoQueEstaEnLista() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregar(0);
		lista.agregar(1);
		lista.agregar(2);
		assertEquals("1",lista.obtener(1),"lista con un elemento retorna posicion del elemento");
	}
	
	@Test
	public void testObtenerElementoQueEstaVariasVecesEnLista() {
		ListaEnlazada lista = new ListaEnlazada();
		lista.agregar(0);
		lista.agregar(1);
		lista.agregar(2);
		lista.agregar(0);
		assertEquals("0, 3",lista.obtener(0),"lista con varios elemento retorna posiciones del elemento");
	}
	

}
