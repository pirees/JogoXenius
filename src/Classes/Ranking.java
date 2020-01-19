package Classes;

import java.util.ArrayList;
import java.util.List;

public class Ranking {
	
	private Jogador User;
	private Jogo jogo;
	private Dificuldade Dificuldade;
	

	public Jogador getUser() {
		return User;
	}

	public void setUser(Jogador user) {
		User = user;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public Dificuldade getDificuldade() {
		return Dificuldade;
	}

	public void setDificuldade(Dificuldade dificuldade) {
		Dificuldade = dificuldade;
	}
	
	public void SalvarRanking() {
		Arquivo a = new Arquivo();
		a.setNomeArquivo("Ranking.TXT");
		a.setTexto(User.getUsuario() + ";" + jogo.getPontos() + ";"+ Dificuldade.getID()+ ";"+ Dificuldade.getNome());
		System.out.println(a.GravarArquivo());	
	}
	
	public List<Ranking> Ler() {

		Arquivo a = new Arquivo();
		a.setNomeArquivo("Ranking.txt");

		List<String> lista_ranking = new ArrayList<String>();

		// retorna a lista de String com as linhas do arquivo
		lista_ranking = a.LerArquivo();

		// criar a lista de ranking retorno do método
		List<Ranking> list_usr = new ArrayList<Ranking>();

		// percorrer as linhas
		for (String linha_da_lista : lista_ranking) {
			// separar cada linha
			String[] vet_campos = linha_da_lista.split(";");

			// criar um obj do tipo ranking
			Ranking r = new Ranking();
			jogo = new Jogo();
			Dificuldade = new Dificuldade();
			jogo.setNomeUsuario(vet_campos[0]);
			jogo.setPontos(Integer.parseInt(vet_campos[1]));
			Dificuldade.setID(Integer.parseInt(vet_campos[2]));
			Dificuldade.setNome(vet_campos[3]);
			r.setDificuldade(Dificuldade);
			r.setJogo(jogo);
						
		    list_usr.add(r);
		}
		return list_usr;
	}
	
	 
	
}

	

	



