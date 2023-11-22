package orientacaoobjetos;

public class Aluno {
	private String Nome;
	private double Nota;
	
	public Aluno(String NomeAluno, double NotaAluno) {
		Nome = NomeAluno;
		Nota = NotaAluno;
    }
	
	public String getNome() {
		return Nome;
	}
	
	public double getNota() {
		return Nota;
	}

	public static void main(String[] args) {
		

	}

}
