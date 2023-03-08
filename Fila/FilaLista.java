package Fila;


public class FilaLista {
	
	private No inicio;
	private No  fim;
	private int tamanho;
	private int lista;
		
	
	
	public int getLista() {
		return lista;
	}

	public void setLista(int lista) {
		this.lista = lista;
	}

	public FilaLista() {
		inicio = null;
		fim = null;
		tamanho = 0;
		lista = 0;
	}
	
	public void enqueue(int info) {
		No novo  = new No(info);
		if(filaVazia()) {
			inicio = novo;
			fim = novo;
		}else {
			fim.setProx(novo);
			fim = novo;
		}
		tamanho++;
	}

	
	public void dequeue() {
		if(filaVazia()) {
		System.out.println("Lista Vazia");
		
		}else {
			if(inicio == fim) {
			inicio = null;
			tamanho = 0;
		   
		}else {
			No p = inicio;
			p = inicio.getProx();
			inicio = p;
			tamanho--;
		}
		
		}
	}
	public boolean filaVazia() {
		if (inicio == null) {
			return true;
		}
		return false;
		
		
	}
	public void imprime() {
		No p = inicio;
		
		if(filaVazia()) {
			System.out.println("lista Vazia");
		}else {
			for(int i = 0; i < tamanho; i++) {
				System.out.println("fila: " + p.getInfo());
				p = p.getProx();
			}
		}
		
	}
}
