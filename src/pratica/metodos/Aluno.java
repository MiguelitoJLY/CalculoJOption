package pratica.metodos;

public class Aluno {
	
	private int nota1;
	private int nota2;
	private int nota3;
	private int nota4;
	
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	public void setNota4(int nota4) {
		this.nota4 = nota4;
	}
	
	public int getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
	
	public boolean getAlunoResultado() {
		int resultado = this.getMediaNota();
		if (resultado >= 60) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getAlunoResultado2() {
		int resultado = this.getMediaNota();
		if (resultado >= 60) {
			return "Aluno foi aprovado!";
		} else {
			return "Aluno foi reprvoado!";
		}
	}

}
