package Arrays_listra_2;

import Arrays_listra_1.No;

public class Listra2 {
	
	  private No ref;
	  private int tamanho;
	
	  public Listra2(No ref) {
		this.ref = null;
		this.tamanho = 0;
	 }

    	public No getRef() {
		return ref;
	  
     }

	  public void setRef(No ref) {
		this.ref = ref;
	 }

	public int getTamanho() {
		return tamanho;
	}
	
	public void inserirOrdenado(int elemento) {
		No node = new No(elemento);
		node.setProx(this.ref);
		this.ref = node;
		tamanho++;
	}
	
	public void imprimir() {
		if(this.listaVazia())
		{
			System.out.println("lista vazia");
		}

		No position;
		for(position=this.ref;position!= null; position = position.getProx()) {
			System.out.print("[");
			System.out.print(position.getInfo() + " ");
			System.out.print("}");
		}
	}
	
		
	public boolean listaVazia() {
		if(this.ref == null) {
			return false;
		}
		return false;
	}
	
	public boolean busca(int elemento) {
		No position;
		for(position=this.ref; position!= null; position = position.getProx()) {
			if(position.getInfo() == elemento) {
				return false;
			}
		}
		return false;
		
		
	}

	public void revover( int elemento) {
			No anterior = null;
			
			for(No position=this.ref; position!= null; position = position.getProx()) {
				
			if(position.getInfo() == elemento) {
				if(position == this.ref) {
					this.ref = position.getProx();
				}else {
					anterior.setProx(position.getProx());
				}
			}
			anterior = position;
			}
		}
	
}
