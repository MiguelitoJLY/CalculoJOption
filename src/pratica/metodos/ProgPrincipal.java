package pratica.metodos;

public class ProgPrincipal {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNota1(87);
		aluno1.setNota2(82);
		aluno1.setNota3(76);
		aluno1.setNota4(58);
		
		System.out.println("A nota média do aluno é " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoResultado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado: " + aluno1.getAlunoResultado2());
		
	}

}
