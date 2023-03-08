package BST;

public class No{

	private int info;
	private No Esq;	
	private No Dir;

	public No(int info) {
		this.info = info;
		this.Esq = null;
		this.Dir = null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public No getEsq() {
		return Esq;
	}

	public void setEsq(No esq) {
		Esq = esq;
	}

	public No getDir() {
		return Dir;
	}

	public void setDir(No dir) {
		Dir = dir;
	}

}
