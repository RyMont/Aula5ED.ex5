package model;

public class PilhaInt {

	Node topo;
	
	public PilhaInt() {
		topo = null;
	}

	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(int dado) {
		Node elemento = new Node();
		elemento.dado = dado;
		
		if(isEmpty()) {
			topo = elemento;
		}
		else {
			elemento.next = topo;
			topo = elemento;
		}
	}
	
	public int pop() throws Exception{
		if (isEmpty()) {
			throw new Exception("Não há elementos na pilha!");
		}
		int valor = topo.dado;
		topo = topo.next;
		return valor;
	}
	
	public int top() throws Exception{
		if (isEmpty()) {
			throw new Exception("Não há elementos na pilha!");
		}
		return topo.dado;
	}
	
	public int size() {
		int size = 0;
		
		if (!isEmpty()) {
			Node aux = topo;
			size = 1;
			while (aux.next != null) {
				size++;
				aux = aux.next;
			}
		}
		return size;
	}
	
	public int max() throws Exception {
		
	    if (isEmpty()) {
	        throw new Exception("Pilha vazia!");
	    }

	    Node aux = topo;
	    int maior = aux.dado;

	    while (aux != null) {
	        if (aux.dado > maior) {
	            maior = aux.dado;
	        }
	        aux = aux.next;
	    }

	    return maior;
	}
}
