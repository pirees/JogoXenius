package Classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import Classes.Dificuldade;

public class Jogo {
		
	private String nomeUsuario;
	private int contador;
	private int pontos;
	private int continua;
	private Dificuldade Dificuldade;
	private ArrayList<Integer> Jogador_Jogada = new ArrayList<Integer>();
	private ArrayList<Integer> Jogada_Jogo = new ArrayList<Integer>();
	Random ran = new Random();
	private Jogador User;
	
	public Jogador getUser() {
		return User;
	}
	public void setUser(Jogador user) {
		User = user;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getCont() {
		return contador;
	}
	public void setCont(int cont) {
		this.contador = cont;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getContinua() {
		return continua;
	}
	public void setContinua(int continua) {
		this.continua = continua;
	}
	public Dificuldade getDificuldade() {
		return Dificuldade;
	}
	public void setDificuldade(Dificuldade dificuldade) {
		this.Dificuldade = dificuldade;
	}

	public ArrayList<Integer> getJogador_Jogada() {
		return Jogador_Jogada;
	}
	public void setJogador_Jogada(ArrayList<Integer> jogador) {
		Jogador_Jogada = jogador;
	}

	public ArrayList<Integer> getJogada_Jogo() {
		return Jogada_Jogo;
	}
	public void setJogada_Jogo(ArrayList<Integer> jogada) {
		Jogada_Jogo = jogada;
	}

	public Jogo() {
		super();	
	}

	public ArrayList<Integer> sorteia(){	
		Jogada_Jogo.add(ran.nextInt(4));	
		return Jogada_Jogo;
	}
		
	public Boolean verifica() {
		for (int i = 0; i < Jogador_Jogada.size(); i++) {
			if (Jogador_Jogada.get(i) != Jogada_Jogo.get(i)) {
				SalvarJogadaJogo();
				return false;
			}else if (Jogador_Jogada.equals(Jogada_Jogo)) {
				continua = 1;
				pontos++;
				sorteia();
				getJogador_Jogada().clear();	
			}		
		}return true;	
		
	}
	
	public void Salvar() {
		Arquivo a = new Arquivo();
		a.setNomeArquivo("Jogo.TXT");
		String Sequencia = "";
		for (Integer Jogada: Jogador_Jogada) {
			Sequencia = Jogada.toString()+ ","+ Sequencia;
		}
		a.setTexto(User.getUsuario() + ";" + this.pontos + ";"+ Dificuldade.getID()+ ";" + Sequencia);
		System.out.println(a.GravarArquivo());	
		
	}
	public void SalvarJogadaJogo() {
		Arquivo a = new Arquivo();
		a.setNomeArquivo("JogadaJogo.TXT");
		String Sequencia = "";				
		for (Integer Jogada: Jogada_Jogo) {
			Sequencia = Jogada.toString()+ ","+ Sequencia;			
		}
		a.setTexto(Sequencia);
		System.out.println(a.GravarArquivo());		
	}
	public List<Jogo> Ler() {

		Arquivo a = new Arquivo();
		a.setNomeArquivo("Jogo.TXT");
		
		List<String> lista_pontos = new ArrayList<String>();		
		
		// retorna a lista de String com as linhas do arquivo
		lista_pontos = a.LerArquivo();
		
		//criar a lista de usuario para retorno do método
		List<Jogo> list_usr = new ArrayList<Jogo>();
		
		//percorrer as linhas
		for (String linha_da_lista : lista_pontos) {
			// separar cada linha
			String[] vet_campos = linha_da_lista.split(";");
			String[] vet_sequencia = vet_campos[3].split(",");
			
			// criar um obj do tipo Usuario
			Jogo usr = new Jogo();
			Dificuldade = new Dificuldade();
			
			usr.setNomeUsuario(vet_campos[0]);
			usr.setPontos(Integer.parseInt(vet_campos[1]));
			Dificuldade.setNome(vet_campos[2]);
			usr.setDificuldade(Dificuldade);
			for ( String  c: vet_sequencia) {
				
			}
			System.out.println(vet_campos[0]+ ";" + vet_campos[1] + ";"+ vet_campos[2]+ ";" + vet_campos[3]);
			
			// adicionar em um List<Usuario>
			list_usr.add(usr);		}
		return list_usr;	
	}
	
	public List <Jogo> LerUltimaJogada() {

		Arquivo a = new Arquivo();
		a.setNomeArquivo("JogadaJogo.TXT");
		
		List<String> lista_jogada = new ArrayList<String>();		
		
		// retorna a lista de String com as linhas do arquivo
		lista_jogada = a.LerArquivo();
		
		//criar a lista de usuario para retorno do método
		List<Jogo> list_usr = new ArrayList<Jogo>();
		
		//percorrer as linhas
		for (String linha_da_lista : lista_jogada) {
			// separar cada linha
			String[] vet_campos = linha_da_lista.split(";");
			String[] vet_sequencia = vet_campos[0].split(",");
			//Integer[] vet_sequencia = new Integer [vet_campos.length];
			
			
			// criar um obj do tipo Usuario
			Jogo usr = new Jogo();
		
			//for ( String  c: vet_sequencia) {	
				//vet_sequencia[0].parseInt(linha_da_lista, 0);
			//}
			System.out.println(vet_campos[0]);
			
			// adicionar em um List<Usuario>
			list_usr.add(usr);		
			}
		return list_usr;			
	}
}
