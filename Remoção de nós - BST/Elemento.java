package ArvoreRemovendo;

public class Elemento<TIPO> {
	private TIPO valor;
	private  Elemento<TIPO> esq;
	private  Elemento<TIPO> dir;
	
	public Elemento(TIPO novoValor) {
		this.valor = novoValor;
		this.esq = null;
		this.dir = null;
	}
	
	public Elemento<TIPO> getEsq() {
		return esq;
	}

	public void setEsq(Elemento<TIPO> esq) {
		this.esq = esq;
	}

	public Elemento<TIPO> getDir() {
		return dir;
	}

	public void setDir(Elemento<TIPO> dir) {
		this.dir = dir;
	}

	public TIPO getValor() {
		return valor;
		
	}
	public void setValor(TIPO valor ) {
		this.valor = valor;
	}


}
