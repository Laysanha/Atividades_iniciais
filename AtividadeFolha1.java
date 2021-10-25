package primeiro_projeto;

import javax.swing.JOptionPane;

public class AtividadeFolha1 {
	public static void main(String[] args) {
		
		String nome = "";
		String cpf = "";
		String rg = "";
		String tpSangue = "";
		String cor = "";
		
		nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
		cpf = JOptionPane.showInputDialog(null, "Digite seu CPF:");
		rg = JOptionPane.showInputDialog(null, "Digite seu RG:");
		tpSangue = JOptionPane.showInputDialog(null, "Digite seu tipo sanguíneo:");
		char sexo = JOptionPane.showInputDialog(null, "Digite seu sexo (M/F) : ").charAt(0);
		double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário bruto mensal:"));
		int qtdDependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes:"));
		cor = JOptionPane.showInputDialog(null, "Digite seua cor: ");
		int nCalcado = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número de calçado:"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		JOptionPane.showMessageDialog(null, "Bem-vindo(a): " + nome
				+ "\n Cpf: " + cpf  
				+ "\n RG: " + rg
				+ "\n Tipo sanguíneo: " + tpSangue
				+ "\n Sexo: " + sexo 
				+ "\n Salario Bruto: " + salarioBruto 
				+ "\n Quantidade de dependentes: " + qtdDependentes
				+ "\n Cor: " + cor
				+ "\n Número do calçado:" + nCalcado
				+ "\n Altura: " + altura
				+ "\n Peso: " + peso
				+ "\n Idade:" + idade
				);		
	}
	
}