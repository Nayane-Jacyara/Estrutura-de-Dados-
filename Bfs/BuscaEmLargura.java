package grafo;
public class BuscaEmLargura {
	
	public void BuscaEmLargura(Grafo grafo, int valor) throws Exception {
		if (valor < 0) {
			valor = 0;
		}
		if (valor >= grafo.numVertices()) {
			valor = grafo.numVertices();
		}
		
		int[] cor = new int[grafo.numVertices()];
		int[] pai = new int[grafo.numVertices()];
		int[] distancia = new int[grafo.numVertices()];
		
		for(int i = 0; i < grafo.numVertices(); i++){
			cor[i] = 0;
			pai[i] = -1;
			distancia[i] = -1;
		}
		
		cor[valor-1] = 1;
		distancia[valor-1] = 0;
		
		Fila fila = new Fila();
		
		fila.enfileira(valor);
		
		while(fila.vazia() != true){
			int origem = (Integer) fila.desenfileira();
			Lista lista = grafo.lista.get(origem-1);
			No aux = lista.getAdjacente();
			while(true){
			if(aux != null){
				if(cor[aux.getValor() -1]==0){
					cor[aux.getValor() -1] = 1;
					pai[aux.getValor() -1] = origem;
					distancia[aux.getValor() -1] = distancia[origem - 1] + 1;
					fila.enfileira(aux.getValor());
				}
			}
			if(aux == null){
				break;
			}
			aux = aux.getProx();
			
			}
			
		}
		
		for(int i = 0; i < grafo.numVertices(); i++){
			System.out.println("Vertice "+grafo.lista.get(i).getVertice()+ ":\npai: "+ pai[i] + "\ndist: " + distancia[i]);
		}
	}
	}