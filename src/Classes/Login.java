package Classes;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Login {
	private int id;
	private Jogador jogador;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Jogador getJogador() {
		return jogador;
	}
	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}
	public Login() {
		super();
	}
	
	public boolean ValidarUsuario(Jogador login) throws IOException {
	
		Arquivo a = new Arquivo();
		
		a.setNomeArquivo("Jogador.TXT");
		
		List<String> lista_usuario = new ArrayList<String>();		
		
		// retorna a lista de String com as linhas do arquivo
		lista_usuario = a.LerArquivo();
		
		//criar a lista de login para retorno do método
		//List<Usuario_Cadastro> list_usr = new ArrayList<Usuario_Cadastro>();
		
		//percorrer as linhas
		for (String linha_da_lista : lista_usuario) {
			// separar cada linha
			String[] vet_campos = linha_da_lista.split(";");
			
			if((login.getUsuario().equals(vet_campos[2]))&&(login.getSenha().equals(vet_campos[3]))) 
			
			{
				return true;	
			}
		}
			
		return false;
	} 
	
}


