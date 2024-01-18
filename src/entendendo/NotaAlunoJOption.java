package entendendo;

import javax.swing.JOptionPane;

public class NotaAlunoJOption {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bem-vindo à plataforma da nossa escola!");
		
		String nota1 = JOptionPane.showInputDialog("Insira sua primeira nota:");
		String nota2 = JOptionPane.showInputDialog("Insira sua segunda nota:");
		String nota3 = JOptionPane.showInputDialog("Insira sua terceira nota:");
		String nota4 = JOptionPane.showInputDialog("Insira sua quarta nota:");
		
		int priNota = Integer.parseInt(nota1);
		int segNota = Integer.parseInt(nota2);
		int terNota = Integer.parseInt(nota3);
		int quaNota = Integer.parseInt(nota4);
		int notaMedia = (priNota + segNota + terNota + quaNota) / 4;
		
		int resultado = JOptionPane.showConfirmDialog(null, "Nota calculada! Deseja ver seu resultado?");
		
		if (resultado == 0) {
			if (notaMedia >= 40) {
				if (notaMedia >= 60) {
					if (notaMedia >= 80) {
					JOptionPane.showMessageDialog(null, "Parabéns! Você foi aprovado com uma nota incrível! Nota " + notaMedia);
					} else {
					JOptionPane.showMessageDialog(null, "Você foi aprovado! Nota " + notaMedia);
					}
				} else {
				JOptionPane.showMessageDialog(null, "Você está de recuperação! Nota " + notaMedia);
				}
			} else {
				if (notaMedia <= 20) {
					JOptionPane.showMessageDialog(null, "Decepcionante... Você reprovou com uma nota baixíssima! Nota " + notaMedia);
				} else {
				JOptionPane.showMessageDialog(null, "Você foi reprovado! Nota " + notaMedia);
				}
			}
	} else {
		JOptionPane.showMessageDialog(null, "Ok! Até ano que vem!");
	}

	}
}
