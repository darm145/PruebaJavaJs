package com.scotia.data;

public class ListaEnlazada {
	private Nodo cabeza;

	public ListaEnlazada() {
		cabeza = null;
	}

	public void agregar(int valor) {
		Nodo nuevoNodo = new Nodo(valor);
		if (cabeza == null) {
			cabeza = nuevoNodo;
		} else {
			Nodo actual = cabeza;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nuevoNodo);
		}
	}

	public void eliminar(int valor) {
		if (cabeza != null) {
			if (cabeza.getValor() == valor) {
				cabeza = cabeza.getSiguiente();
			} else {
				Nodo actual = cabeza;
				Nodo anterior = null;
				while (actual != null && actual.getValor() != valor) {
					anterior = actual;
					actual = actual.getSiguiente();
				}
				if (actual != null) {
					anterior.setSiguiente(actual.getSiguiente());
				}
			}
		}
	}

	public boolean buscar(int valor) {
		Nodo actual = cabeza;
		while (actual != null) {
			if (actual.getValor() == valor) {
				return true;
			}
			actual = actual.getSiguiente();
		}
		return false;
	}

	public String obtener(int valor) {
		String posiciones="";
		int posicionActual=0;
		Nodo nodoActual=cabeza;
		while(nodoActual!=null) {
			if(nodoActual.getValor()==valor) {
				if(!posiciones.isEmpty()) {
					posiciones +=", ";
				}
				posiciones+= posicionActual;
			}
			posicionActual+=1;
			nodoActual = nodoActual.getSiguiente();
		}
		return posiciones;
	}
	
	public void imprimir() {
		String valores="";
		Nodo actual=cabeza;
		while (actual!=null) {
			if(!valores.isEmpty()) {
				valores+=", ";
			}
			valores+= actual.getValor();
			actual= actual.getSiguiente();
		}
		System.out.println(valores);
	}
	
	public int tamaño() {
		int total=0;
		Nodo actual=cabeza;
		while(actual!=null) {
			total+=1;
			actual=actual.getSiguiente();
		}
		return total;
	}
	
	

}
