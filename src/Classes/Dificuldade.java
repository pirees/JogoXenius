package Classes;

public class Dificuldade {
	
	private int ID;
	private String Nome;
	private int Tempo;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getTempo() {
		return Tempo;
	}

	public void setTempo(int tempo) {
		Tempo = tempo;
	}
	
	public Dificuldade() {
		this.ID = 0;
		this.Nome = "";
		this.Tempo = 0;
	}
}
