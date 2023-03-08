package TabelaHash;

public class Dicionario {
	ListaDinamica Vetor[];
	
	public Dicionario () {
		Vetor = new  ListaDinamica[26];
		inicializaListas();
	}
	
	final void inicializaListas() {
		for (int  i = 0; i<26; i++) {
			Vetor[i] = new ListaDinamica();
			
		}
	}
	
	final int HashTable(String palavra ) {
		//cacular o valor hash da minha palavra 
		
		palavra = palavra.toLowerCase();
		int posicao = palavra.charAt(0);
		
		return posicao -97;
	}
	
	final void addTabela(String palavra, String descricao) {
		Vetor[HashTable(palavra)].insere(palavra,descricao);
	}
	
	final void excluiItem(String palavra) {
		System.out.println("Itens nesse indice:\n");
		Vetor[HashTable(palavra)].ImprimeLista();
		Vetor[HashTable(palavra)].remove(palavra);
		System.out.println("Itens nesse indice apos excluir:\n");
		Vetor[HashTable(palavra)].ImprimeLista();
	}
	
	final void buscaPalavra(String palavra) {
		Vetor[HashTable(palavra)].busca(palavra);	
		
		}
	
	public static void main (String[] args) {
		Dicionario teste = new Dicionario();
		teste.addTabela("Notebook", "Computador completo portátil, espécie de laptop, suas dimensões variam, mas tem como característica ser leve, pequeno e que pode ser levado para vários lugares.");
		teste.addTabela("Amor", "Sentimento apaixonado por outra pessoa: sinto amor por você.");
		teste.addTabela("Avião", "Aeronave utilizada como meio de transporte, equipada com asas, mais pesada que o ar e propelida por motor de explosão, que aciona uma (ou mais de uma) hélice, ou por turbina a gás, nos modelos a jato, podendo aterrissar em solo ou na água.");
		teste.addTabela("Carro", "Qualquer veículo que se locomova sobre rodas; veículo, automóvel.");
		teste.addTabela("Casa", "Construção em alvenaria usada para morar, com distintos formatos ou tamanhos, normalmente térrea ou com dois andares.");
		teste.addTabela("Gato", "Nome comum dado ao pequeno mamífero da família dos felídeos Felis Catus, carnívoro e doméstico, muito popular como animal de estimação; ");
		
		//buscar um elemento existente que seja o primeiro da lista
		 teste.buscaPalavra("Amor");
		 //buscar um elemento existente que seja o último da lista e não seja o primeiro
		 teste.buscaPalavra("Avião");
		 //buscar um elemento que nunca foi inserido
		 teste.buscaPalavra("Gafro");
		 //buscar um elemento que já foi inserido e removido
		 teste.excluiItem("Casa");
		 teste.buscaPalavra("Casa");
		 //remover todos os elementos de uma posição da tabela e voltar a inseri elementos novamente
		 teste.excluiItem("Avião");
		 teste.excluiItem("Amor");
		 teste.addTabela("Amor", "Sentimento apaixonado por outra pessoa: sinto amor por você.");
		 teste.addTabela("Avião", "Aeronave utilizada como meio de transporte, equipada com asas, mais pesada que o ar e propelida por motor de explosão, que aciona uma (ou mais de uma) hélice, ou por turbina a gás, nos modelos a jato, podendo aterrissar em solo ou na água.");
		 
	}


}
