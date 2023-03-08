package BubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
	int[]v = new int[50000];
	//int[]v = new int[100000];
	//int[]v = new int[200000];
	int cc = 30;
	
	   long tempoTotalInicial = System.currentTimeMillis();
	   	
		while (cc>0) {
			
			long tempo1 = System.currentTimeMillis();
			//System.out.println("tempo inicial = " + tempo1);
			
			for(int i = 0; i < v.length; i++) {
				 v[i] = (int) Math.floor(Math.random() * v.length);
			}
			
			bolha(v);
			cc--;
			
			//System.out.println("Ordenação comcluida!");
		     //System.out.println(Arrays.toString(v));
		     
		     long tempo2 = System.currentTimeMillis();
			 //System.out.println("tempo final = " + tempo2);
			 System.out.println( (tempo2 - tempo1));
			 
		}
	    
		 long tempoTotalFinal = System.currentTimeMillis();
		 System.out.println("\nTEMPO TOTAL FINAL: " + (tempoTotalFinal - tempoTotalInicial) + " ms");
		 System.out.println();
	    
	}

	private static void bolha(int[] v) {
		for (int ultimo = v.length-1; ultimo > 0; ultimo--){
			for(int i = 0; i < ultimo; i++)
				if(v[i] > v[i+1])
					trocar(v, i , i+1);
		}
		
		
	}

	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
		
	}

}
