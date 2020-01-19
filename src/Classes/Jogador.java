package Classes;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

	private String usuario;
	private String sobrenome;
	private String nome;
	private String senha;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Jogador() {
		super();
	}
	//METODO
	public void Salvar() {
		Arquivo a = new Arquivo();
		a.setNomeArquivo("Jogador.txt");
		a.setTexto(this.nome+";"+this.sobrenome+";"+this.usuario+";"+this.senha);
		System.out.println(a.GravarArquivo());	
		}	
	
	public List<Jogador> Ler() {

		Arquivo a = new Arquivo();
		
		a.setNomeArquivo("Jogador.txt");
		
		List<String> lista_usuarios = new ArrayList<String>();		
		
		// retorna a lista de String com as linhas do arquivo
		lista_usuarios = a.LerArquivo();
		
		//criar a lista de Jogador para retorno do método
		List<Jogador> list_usr = new ArrayList<Jogador>();
		
		//percorrer as linhas
		for (String linha_da_lista : lista_usuarios) {
			// separar cada linha
			String[] vet_campos = linha_da_lista.split(";");
			
			// criar um obj do tipo Jogador
			Jogador usr = new Jogador();
				
			usr.setNome(vet_campos[0]);
			usr.setSobrenome(vet_campos[1]);
			usr.setUsuario(vet_campos[2]);
			usr.setSenha(vet_campos[3]);
			
			System.out.println(vet_campos[0] +";"+ vet_campos[1]+";"+ vet_campos[2] +";"+ vet_campos[3]);
			
			// adicionar em um List<Jogador>
			list_usr.add(usr);
		}
		return list_usr;	
	}	
	public boolean verificaAvatar() {
		
		Arquivo a = new Arquivo();
		a.setNomeArquivo("Jogador.txt");
		List<String> linhas = new ArrayList<String>();
		linhas = a.LerArquivo();
			
				for (String linha_da_lista : linhas) {
					String[] vet_campos = linha_da_lista.split(";");
					Jogador j =new Jogador();
					j.setUsuario(vet_campos[2]);
					if((this.usuario.equals(j.getUsuario())))
					{
						return false;	
					}			
				}
				Salvar();				
				return true;			
			} 	
}
