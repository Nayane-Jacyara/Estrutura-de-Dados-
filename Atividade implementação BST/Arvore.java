package BST;

public class Arvore {

	private No raiz;
	private int altura;

	public Arvore(No raiz) {
		this.raiz = raiz ;
		this.altura = 1;
	}
	public No getRaiz() {
		return raiz;
	}
	public void setRoot(No raiz) {
		this.raiz = raiz;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public boolean Vazio() {
		return this.raiz == null;
	}

	public void adicionar(int info) {
		No subtree = new No(info);
		No ref = this.raiz;
		while(true) {
			if (ref.getInfo() >= info) {
				if (ref.getEsq() == null) {
					ref.setEsq(subtree);
					break;
				} else {
					ref = ref.getEsq();
				}
			}else {
				if(ref.getDir() == null) {
					ref.setDir(subtree);
					break;
				} else {
					ref = ref.getDir();
				}
			}
		}
	}

	public No Sucessor(int info) throws NullPointerException {
		No ref = buscar(info);
		if (ref == null) {
			throw new NullPointerException("Nao encontrado !");
		}
		if (ref.getDir() != null) {
			return Minimo(ref.getDir());
		}else {
			No suc = null;
			No ant = this.raiz;
			while(ant!= ref) {
				if (ref.getInfo()< ant.getInfo()) {
					suc = ant;
					ant = ant.getEsq();
				}else {
					ant = ant.getDir();
				}
			}
			if (suc == null) {
				throw new NullPointerException(" Nao encontrado!");
			}else {
				return suc;
			}
		}
	}

	public No buscar(int info) throws NullPointerException {
		No ref = this.raiz;
		while(true) {
			if (ref.getInfo() == info) {
				return ref;
			}
			if (ref.getInfo() > info) {
				if (ref.getEsq() == null) {
					throw new NullPointerException(" Nao encontrado!");
				} else {
					ref = ref.getEsq();
				}
			}else {
				if(ref.getDir() == null) {
					throw new NullPointerException(" Nao encontrado!");
				} else {
					ref = ref.getDir();
				}
			}
		}
	}

	public No Maximo(No raiz) {
		if(raiz==null) {
			return null;
		}
		while(raiz.getDir() != null) {
			raiz = raiz.getDir();
		}
		return raiz;
	}

	public No Minimo(No raiz) {
		if(raiz==null) {
			return null;
		}
		while(raiz.getEsq() != null) {
			raiz = raiz.getEsq();
		}
		return raiz;
	}

	private void printNo(No naiz) {
		System.out.print("(" + naiz.getInfo()+ ")");
	}

	public void preOrdem(No raiz) {
		if (raiz != null) {
			printNo(raiz);
			preOrdem(raiz.getEsq());
			preOrdem(raiz.getDir());
		}
	}
	public void emOrdem(No raiz) {
		if (raiz != null) {
			emOrdem(raiz.getEsq());
			printNo(raiz);
			emOrdem(raiz.getDir());
		}
	}

	public void posOrdem(No raiz) {
		if (raiz != null) {
			posOrdem(raiz.getEsq());
			posOrdem(raiz.getDir());
			printNo(raiz);
		}
	}

}