package Pilha;

public class PilhaLista {
	
	private No topo;

	public PilhaLista() {
		this.topo = null;
	}
	
	public void Push(String info) {
		No fila = new No (info, this.topo);
		this.topo = fila;
	}
	
	public String Pop() {
		if(topo == null) {
			return "Pilha vazia";
		}
		String info = this.topo.getInfo();
		this.topo = this.topo.getProx();
		return info;
	}
	
	public boolean PilhaVazia() {
		if (topo == null) {
			return true;
		}
		return false;
		
	}
	
	public void Imprime() {
		for(No s = this.topo; s != null; s = s.getProx()) {
			System.out.println("[" + s.getInfo() + "]");
		}
	}
	public No gettopo() {
		return topo;
	}

	public void setTopo(No topo) {
		this.topo = topo;
	}

}
