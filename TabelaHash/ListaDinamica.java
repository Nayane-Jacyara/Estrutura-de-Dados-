package TabelaHash;

public class ListaDinamica {
	Lista Primeiro;
	Lista Ultimo;
	int Tamanho = 1000;
	
	public ListaDinamica() {
		Primeiro = null;
		Ultimo = Primeiro;
	}
	
	public void insere(String nome, String descricao) {
		if(Primeiro == null) {
			Primeiro = new Lista();
			Ultimo = Primeiro;
			Lista Novo = new Lista();
			Novo.setNome(nome);
			Novo.setDescricao(descricao);
			Novo.setProx(null);
			Ultimo.setProx(Novo);
			Ultimo = Novo;
			Tamanho++;
		} else {
			Lista Novo = new Lista();
			Novo.setNome(nome);
			Novo.setDescricao(descricao);
			Novo.setProx(null);
			Ultimo.setProx(Novo);
			Ultimo = Novo;
			Tamanho++;
		}
	}
	
	public void ImprimeLista() {
		Lista Percorre = Primeiro.getProx();
		
		while (Percorre !=null) {
			System.out.println("Palavra:" + Percorre.getNome());
			System.out.println("Descrição:" + Percorre.getDescricao() + "\n");
			Percorre = Percorre.getProx();
		}
	}
	
	public void remove(String Nome) {
		Lista Remove = Primeiro.getProx();
		
		Lista Sentinela = Primeiro;
		
		if(!(Primeiro == null)) {
			while(Remove != null) {
				if( Remove.getNome().equals(Nome)) {
					
					if(Remove.getProx() == null) {
						Ultimo = Sentinela;
						Ultimo.setProx(null);
						Remove = null;
						Tamanho--;
						break;
					} else {
						Sentinela.setProx(Remove.getProx());
						Remove.setProx(null);
						Remove = null;
						Tamanho--;
						break;
					}
				}
				Remove = Remove.getProx();
				Sentinela = Sentinela.getProx();
			}
		}
	}
	
	public boolean busca(String Nome) {
		Lista Percorre = Primeiro.getProx();
		int find = 0;
		while(Percorre !=null) {
			if(Percorre.getNome().equals(Nome)) {
				System.out.println("Palavra:" + Percorre.getNome());
				System.out.println("Descrição:" + Percorre.getDescricao() + "\n");
				find = 1;
				break;
			}
			Percorre = Percorre.getProx();
		}
		if(find != 1) {
			System.out.println("Palavra não encontrada");
		}
		return false ;
	}

}
