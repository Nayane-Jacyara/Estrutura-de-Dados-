package ArvoreRemovendo;

public class Main {

	public static void main(String[] args) {
		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.adicionar(8);
		arvore.adicionar(6);
		arvore.adicionar(18);
		arvore.adicionar(1);
		arvore.adicionar(9);
		arvore.adicionar(7);
		arvore.adicionar(14);
		arvore.adicionar(16);
		arvore.adicionar(22);
		arvore.adicionar(17);
		
		System.out.println("\nEm-Ordem");
		arvore.emOrdem(arvore.getRaiz());
		
		arvore.remover(7);
		
		System.out.println("\nEm-Ordem");
		arvore.emOrdem(arvore.getRaiz());
		
        arvore.remover(14);
		
		System.out.println("\nEm-Ordem");
		arvore.emOrdem(arvore.getRaiz());
		
        arvore.remover(6);
		
		System.out.println("\nEm-Ordem");
		arvore.emOrdem(arvore.getRaiz());
		
        arvore.remover(18);
		
		System.out.println("\nEm-Ordem");
		arvore.emOrdem(arvore.getRaiz());
		
        arvore.remover(8);
		
		System.out.println("\nEm-Ordem");
		arvore.emOrdem(arvore.getRaiz());
	

	}

}
