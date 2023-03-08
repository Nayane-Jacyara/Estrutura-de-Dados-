package Pilha;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		PilhaLista fila = new PilhaLista();
		Scanner sc  = new Scanner(System.in);
		String expresao = sc.nextLine();
		String aux = " ";
		sc.close();
		
		for(int i =0; i < expresao.length(); i++) {
			if (expresao.charAt(i) == '(') {
				fila.Push("(");
			}else if(expresao.charAt(i) == ')') {
				aux = fila.Pop();
			}
		}
		if (fila.PilhaVazia() && !aux.equals("Pilha vazia")) {
			System.out.println("EXPRESAO VALIDA");
		}else {
			System.out.println("EXPRESAO INVALIDA");
		}
		
		fila.Imprime();

	}

}
