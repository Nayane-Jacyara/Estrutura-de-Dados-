package grafo;
public class Fila {
	  public static class Celula { 
		  Object item;
		  Celula prox;  
	  }
	  
	  private Celula frente;
	  private Celula tras;
	// Operações 
	  
	public Fila (){ // Cria uma Fila vazia
	  this.frente = new Celula();
	  this.tras = this.frente;
	  this.frente.prox = null;
	  } 

	public void enfileira (Object x) {
	  this.tras.prox = new Celula();
	  this.tras= this.tras.prox;
	  this.tras.item = x;
	  this.tras.prox = null ;
	  }

	public Object desenfileira()throws Exception {
	  Object item = null;
	  if (this.vazia())
	     throw new Exception ( "Erro : A fila esta vazia" );
	  this.frente = this.frente.prox;
	  item = this.frente .item;
	  return item;
	  }

	public boolean vazia(){
	  return (this.frente == this.tras);
	  }
	}