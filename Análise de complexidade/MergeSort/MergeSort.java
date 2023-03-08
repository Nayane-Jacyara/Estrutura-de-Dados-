package MergeSort;

public class MergeSort {
	
	public static void main(String[] args) {
		//int[]v = new int[50000];
		//int[]v = new int[100000];
		int[]v = new int[200000];
		int[]w = new int[v.length];
		int cc = 30;
		
		long tempoTotalInicial = System.currentTimeMillis();
		
		 while (cc>0) {
			 
			 long tempo1 = System.currentTimeMillis();
			 //System.out.println("tempo inicial = " + tempo1);
			 
			 for(int i = 0; i < v.length; i++) {
				 v[i] = (int) Math.floor(Math.random() * v.length);
			}
			 
			
			    mergeSort(v, w, 0, v.length-1);
				//System.out.println("Ordenação comcluida!");
				//System.out.println(Arrays.toString(v));
				
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
		 
			 private static void mergeSort(int[] v, int[] w, int inicio, int fim) {
					if(inicio < fim) {
						int meio = (inicio + fim) / 2;
						mergeSort(v, w, inicio, meio);	
						mergeSort(v, w, meio+1, fim);
						intercalar(v, w, inicio, meio, fim);
						
					}
					
				
				}
				
				private static void intercalar(int[] v, int[] w, int inicio, int meio, int fim) {
					for (int k = inicio; k <= fim; k++)
					    w[k] = v[k];
					
					int i = inicio;
					int j =meio + 1;
					
					for(int k = inicio; k <= fim; k++) {
						 if(i > meio) v[k] = w[j++];
						 else if (j > fim) v [k] = w[i++];
						 else if (w[i] < w[j]) v[k] = w[i++];
						 else v[k] = w[j++];
					}
				}

}
		
		
		

	