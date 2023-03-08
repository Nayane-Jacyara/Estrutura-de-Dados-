package grafo;


public class Lista {
	int Inicial;
    No Adjacente = null;
    No ultimo = null;
    
    public Lista(int valor){
    	this.Inicial = valor;
    }
    
    public void adicionarNo(int valor){
    	No novo = new No(valor, null);
		if(Adjacente == null) {
			Adjacente = novo;
			ultimo = novo;
		}else{
			ultimo.setProx(novo);
			novo.setProx(null);
			ultimo = novo;
		}
    }
	public int getVertice() {
		return Inicial;
	}

	public void setVertice(int valor) {
		this.Inicial = valor;
	}

	public No getAdjacente() {
		return Adjacente;
	}

	public void setAdjacente(No valor) {
		this.Adjacente = valor;
	}
    
	}