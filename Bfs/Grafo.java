package grafo;

import java.util.ArrayList;

public class Grafo {
	ArrayList<Lista> lista = new ArrayList<Lista>();	
  
  private int numVertices;
  public void insereGrafo (int numVertices) {
	  Lista lis = new Lista(numVertices);
	  lista.add(lis);
	  this.numVertices++;
  }
  
  public void insereAresta ( int v1, int v2, int peso) {
	  for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getVertice() == v1) {
				lista.get(i).adicionarNo(v2);
			}
		}
  }

  public void imprime ( ) {
	  for (int i = 0; i < numVertices; i++) {
			Lista v = lista.get(i);
			String text = "";
			System.out.println("Lista vertice "+ (i+1) +":");
			if (v.getAdjacente() != null) {
				No aux = v.getAdjacente();

				if (aux.getProx() == null) {
					System.out.println(aux.getValor());
				} else {
					while (true) {
						System.out.println(aux.getValor());
						if (aux.getProx() == null) {
							break;
						}
						aux = aux.getProx();
					}
				}
				
			}
		}
  }
	  
  public int numVertices(){
	  return this.numVertices;
  }

public ArrayList<Lista> getLista() {
	return lista;
}

}