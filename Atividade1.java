package primeiro_projeto;

import javax.swing.JOptionPane;

public class Atividade1 {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome do aluno:");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1 do aluno(a) " + nome + ": ")); 
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2 do aluno(a) " + nome + ": "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3 do aluno(a) " + nome + ": "));
		
		double media = (nota1 + nota2 + nota3)/3;
		
		JOptionPane.showMessageDialog(null, nome + " Sua média é :" + media);
	}
}

