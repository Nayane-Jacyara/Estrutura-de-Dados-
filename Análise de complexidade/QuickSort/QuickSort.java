package QuickSort;

public class QuickSort {

	public static void main(String[] args) {
		int[]vetor = new int[50000];
		//int[]vetor = new int[100000];
		//int[]vetor = new int[200000];
		int cc = 30;
		
		long tempoTotalInicial = System.currentTimeMillis();
		
		 while (cc>0) {
			 
			 
			 
			 for(int i = 0; i < vetor.length; i++) {
				 vetor[i] = (int) Math.floor(Math.random() * vetor.length); 
			 }
			 long tempo1 = System.currentTimeMillis();
			// System.out.println("tempo inicial = " + tempo1);
			 
			 
			
			 quicksort(vetor, 0, vetor.length -1 );  
			 
			 //System.out.println("Ordenação comcluida!");
			 for(int i = 0; i< vetor.length; i++) {
				 //System.out.println(vetor[i] + " ");
			 }
			 
			 long tempo2 = System.currentTimeMillis();
			 //System.out.println("tempo final = " + tempo2);
			 System.out.println( (tempo2 - tempo1));
			 System.out.println();
			 cc--;
			}
		 
		 long tempoTotalFinal = System.currentTimeMillis();
		 System.out.println("\nTEMPO TOTAL FINAL: " + (tempoTotalFinal - tempoTotalInicial) + " ms");
		 System.out.println();
		
		 
		 
	}
	
	static void quicksort(int[] vetor, int esquerda, int direita) {
		if( esquerda < direita) {
			int p = particao( vetor,esquerda, direita );
			quicksort(vetor, esquerda, p);
			quicksort(vetor, p + 1, direita);
		}
		
	}
	
	static int particao (int[] vetor, int esquerda, int direita) {
		int meio = (int) (esquerda + direita) / 2;
		int pivo = vetor[meio];
		int i = esquerda - 1 ;
		int j = direita + 1;
		while(true) {
			do {
				i++;
			}while(vetor[i] < pivo);
			do {
				j--;
			}while(vetor[j] > pivo);
			if (i>=j) {
				return j;
			}
			int aux = vetor[i];
			vetor[i] = vetor[j];
			vetor[j] = aux;
		}
		
	}

}
