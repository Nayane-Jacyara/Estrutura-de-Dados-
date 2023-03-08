package grafo;

public class Main {
public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	
	Grafo Grafo = new Grafo();
	Grafo.insereGrafo(1);
	Grafo.insereGrafo(2);
	Grafo.insereGrafo(3);
	Grafo.insereGrafo(4);
	Grafo.insereGrafo(5);
	Grafo.insereGrafo(6);
	Grafo.insereGrafo(7);
	Grafo.insereGrafo(8);
	
	Grafo.insereAresta(1, 2, 7);
    Grafo.insereAresta(1, 3, 8);
    Grafo.insereAresta(1, 4, 6);
    
    Grafo.insereAresta(2, 1, 6);
    Grafo.insereAresta(2, 4, 5);
    Grafo.insereAresta(2, 5, 2);
    
    Grafo.insereAresta(3, 1, 3);
    
    Grafo.insereAresta(5, 2, 2);
    
    Grafo.insereAresta(6, 5, 4);
    Grafo.insereAresta(6, 7, 5);
    Grafo.insereAresta(6, 8, 4);
    
    Grafo.insereAresta(7, 6, 5);
    
    Grafo.insereAresta(8, 6, 1);

    BuscaEmLargura busca = new BuscaEmLargura();
    busca.BuscaEmLargura(Grafo, 1);

}

}