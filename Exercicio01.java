package primeiro_projeto;

import javax.swing.JOptionPane;

/* Fa�a um programa para ler as seguintes informa��es de uma pessoa :
   Nome, Idade, Sexo, Peso e Telefone.	*/

public class Exercicio01 {
	 
	public static void main(String[] args) {
//		Integer idade;
//		String nome, telefone;
//		Double peso;
//		
//		nome = JOptionPane.showInputDialog(null, "Informe seu nome:");
//		
//		idade = Integer.parseInt((
//					JOptionPane.showInputDialog("Informe sua idade:"))
//				);
//		
//		peso = Double.parseDouble(
//					JOptionPane.showInputDialog("Informe seu peso:")
//				);
//				
//		telefone = "9909-9485";
//		
//		
//		System.out.println("Digite seu nome:" + nome 
//				+ "\nDigite sua idade:" + idade 
//				+ "\nDigite seu peso:" + peso
//				+ "\nDigite seu telefone:" + telefone );
		
		
		/*
		Fa�a um programa onde dados valores para hora, minuto e segundo, transforme 
		em segundos todas estas informa��es e mostre este resultado no v�deo.
		*/
		
//		int segundo, minuto, hora, total;
//		
//		segundo = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo:"));
//		minuto = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto:"));
//		hora = Integer.parseInt(JOptionPane.showInputDialog("Informe o hora:"));
//		
//		minuto = minuto * 60;
//		hora = hora * 3600;
//		
//		total = minuto + hora + segundo;
//		
//		System.out.println("TEMPO EM SEGUNDOS" + total);
		
		/*
		Escreva um programa para calcular o consumo m�dio de um autom�vel (media em Km/l), 
		sendo que conhecemos � dist�ncia total percorrida e o volume de combust�vel consumido pare percorr�-la.
		*/
		
//		Double totalDistancia, volCombustivel, total;
//		
//		totalDistancia = Double.parseDouble(
//				JOptionPane.showInputDialog("Informe � dist�ncia total percorrida :")
//		);
//		
//		volCombustivel = Double.parseDouble(
//				JOptionPane.showInputDialog("Informe o volume de combust�vel consumido :")
//		);
//		
//		total = totalDistancia / volCombustivel;
//		
//		System.out.println("fim:" + total + "Km/l");
//		
		/*
		Dado nome, pre�o de compra e o pre�o de venda de uma mercadoria. 
		Fa�a um programa que mostre o nome e o lucro em reais obtido com a venda da mesma.
		*/
		String nomeProd;
		Double prVenda, prCompra, total, porcent;
		
		nomeProd = JOptionPane.showInputDialog(null, "Informe seu nome:");
	
		prVenda = Double.parseDouble(
				JOptionPane.showInputDialog("PrVenda :")
		);

		prCompra = Double.parseDouble(
				JOptionPane.showInputDialog("PrCompra :")
		);
		
		total = prVenda - prCompra;
		
		porcent = ((total/prVenda) * 100);
				
		//System.out.println(nomeProd + "\n Total" + total);
		
		JOptionPane.showMessageDialog(null, nomeProd + " Fim:" + total + "e SEU PORCENTUAL �:" + porcent);
	}
	//sysout
}


