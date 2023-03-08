package ArvoreRemovendo;

public class Arvore<TIPO extends Comparable> {
	
	private Elemento<TIPO> raiz;
	
	public Arvore() {
		this.raiz = null;
	}

	public void adicionar (TIPO valor) {
		Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
		if(raiz == null) {
			this.raiz = novoElemento;
		}else {
			Elemento<TIPO> atual = this.raiz;
			while(true){
				if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
					if (atual.getEsq() !=null) {
						atual = atual.getEsq();
					}else { //se ele for menor que o pai 
						atual.setEsq(novoElemento);
						break;
					}
				}else { // se ele for maior que pai 
					if (atual.getDir()!=null) {
						atual = atual.getDir();
					}else {
						atual.setDir(novoElemento);
						break;
					}
					
				}
			}
		}
	}
	
	public Elemento<TIPO> getRaiz() {
		return raiz;
	}

	public void setRaiz(Elemento<TIPO> raiz) {
		this.raiz = raiz;
	}

	public void emOrdem(Elemento<TIPO>atual) {
		if(atual != null) {
			emOrdem(atual.getEsq());
			System.out.println(atual.getValor());
			emOrdem(atual.getDir());
		}
	}
	
	public void preOrdem(Elemento<TIPO>atual) {
		if(atual != null) {
			System.out.println(atual.getValor());
			preOrdem(atual.getEsq());
			preOrdem(atual.getDir());
		}
	}
	
	public void posOrdem(Elemento<TIPO>atual) {
		if(atual != null) {
			posOrdem(atual.getEsq());
			posOrdem(atual.getDir());
			System.out.println(atual.getValor());
		}
	}
	
	public void remover(TIPO valor) {
		// buscar o elemento na arvore 
		Elemento<TIPO> atual = this.raiz;
		Elemento<TIPO> paiAtual = null;
		while(atual !=null) {
			if (atual.getValor().equals(valor)){
				break;
			}else if(valor.compareTo(atual.getValor()) == -1){//valor procurado  e menor que o atual
				    paiAtual = atual;
					atual = atual.getEsq();
			}else {
				paiAtual = atual;
				atual = atual.getDir();
				
			}
			    
		}
		if (atual !=null) {
			
			//elemento tem 2 filhos ou elemento tem somente filho a direita
			if(atual.getDir() !=null) {
				
				Elemento<TIPO> substituto = atual.getDir();
				Elemento<TIPO> paiSubstituto = atual;
				while(substituto.getEsq() !=null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsq();				
					}
				substituto.setEsq(atual.getEsq());
				if(paiAtual !=null) {
					
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
						paiAtual.setEsq(substituto);
					}else {
						paiAtual.setDir(substituto);
					}
					
				}else {// se nao tem paiAtual, entao e a raiz
					this.raiz = substituto;
				}
				//removeu o elemento da arvore
				if(substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) { //substituto < paiSubstituto
					
				}
				
			
			}else if(atual.getEsq() !=null) {// tem filhos so a esquerda 
				Elemento<TIPO> substituto = atual.getEsq();
				Elemento<TIPO> paiSubstituto = atual;
				while(substituto.getDir() !=null) {
					paiSubstituto = substituto;
					substituto = substituto.getDir();	
					}
				if(paiAtual !=null) {
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
						paiAtual.setEsq(substituto);
					}else {
						paiAtual.setDir(substituto);
					}
				}else { // se for a raiz
					this.raiz = substituto;
				}
				//removeu o elemento da arvore
				if(substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) { //substituto < paiSubstituto
					
				}
				
			}else {// nao tem filhos
				if(paiAtual !=null) {
					if(atual.getValor().compareTo(paiAtual.getValor()) == -1) { // atual < paiAtual
						paiAtual.setEsq(null);
					}else {
						paiAtual.setDir(null);
					}
				}else {// e a raiz
					this.raiz = null;
				}
			}
			return;
		}else {
			return;
		}
	}
}
