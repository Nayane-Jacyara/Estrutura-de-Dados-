package BST;


public class Main {

	public static void main(String[] args) {
		No raiz = new No(15);
		Arvore arvore = new Arvore(raiz);
	
		arvore.adicionar(10);
		arvore.adicionar(8);
		arvore.adicionar(5);
		arvore.adicionar(9);
		arvore.adicionar(7);
		arvore.adicionar(18);
		arvore.adicionar(13);
		arvore.adicionar(20);
		System.out.println();
	
		
	    arvore.emOrdem(arvore.getRaiz());
			System.out.println();
			System.out.println();

			try {
				System.out.print("buscar por: ");
				System.out.println(arvore.buscar(18).getInfo());
				System.out.print("buscar por: 6 ");
				System.out.println(arvore.buscar(6));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println();

			System.out.print("minimo: ");
			System.out.println(arvore.Minimo(arvore.getRaiz()).getInfo());
			System.out.println();

			System.out.print("maximo: ");
			System.out.println(arvore.Maximo(arvore.getRaiz()).getInfo());
			System.out.println();

			try {
				System.out.print("sucessor de 18: ");
				System.out.println(arvore.Sucessor(18).getInfo());
				System.out.print("sucessor de 13: ");
				System.out.println(arvore.Sucessor(13).getInfo());
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("");
		}
	
	}


