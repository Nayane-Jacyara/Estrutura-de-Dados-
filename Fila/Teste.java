package Fila;

public class Teste {

	public static void main(String[] args) {
		FilaLista  fila =  new FilaLista();
		 


		 
		fila.enqueue(2);
		fila.enqueue(4);
		fila.enqueue(6);
		
		fila.imprime();
		System.out.println();
		
		fila.dequeue();
		fila.dequeue();
		fila.dequeue();
		
		fila.imprime();
		
		System.out.println();
		
		fila.enqueue(3);
		fila.enqueue(7);
		fila.enqueue(9);
		fila.imprime();
		
	}

}
