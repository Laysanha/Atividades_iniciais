package primeiro_projeto;

import javax.swing.JOptionPane;

public class CadastroAula1 {
	public static void main(String[] args) {
		
		String nome = "";
		
		nome = JOptionPane.showInputDialog("Informe seu nome:");
		int idade = Integer.parseInt((JOptionPane.showInputDialog("Informe sua idade:")));
		double altura = Double.parseDouble((JOptionPane.showInputDialog("Informe sua altura:")));
		char sexo = JOptionPane.showInputDialog("Informe seu sexo(M/F):").charAt(0);
		
		JOptionPane.showMessageDialog(null, "Bem vindo(a): " 
				+ nome 
				+ "\n Sua idade ser� DAQUI 20 anos ser�: "
				+ (idade + 20) + "\n Sua altura �: " + altura
				+ "\n Seu sexo �: " + sexo);
	}
}
