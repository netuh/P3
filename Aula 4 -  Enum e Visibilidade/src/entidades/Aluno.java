package entidades;

public class Aluno {

	private String nome;
	
	public Aluno (String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void copiaNome(Aluno a) {
		a.nome = this.nome;
	}
	
	public void imprime() {
		System.out.println("Nome do aluno eh "+nome);
	}

	public String getNome() {
		return nome;
	}
}
