package aula_2;

import javax.swing.JOptionPane;

public class IdadeUserMaiorOuMenor {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Informe seu nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sia idade?"));
		
		if (idade >= 18) {
			JOptionPane.showConfirmDialog(null, "Você:" + nome + "De maior");
		} else {
			JOptionPane.showConfirmDialog(null, "Você:" + nome + "De menor");
		}	
	}
}
