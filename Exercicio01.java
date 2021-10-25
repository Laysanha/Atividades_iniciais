package primeiro_projeto;

import javax.swing.JOptionPane;

/* Faça um programa para ler as seguintes informações de uma pessoa :
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
		Faça um programa onde dados valores para hora, minuto e segundo, transforme 
		em segundos todas estas informações e mostre este resultado no vídeo.
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
		Escreva um programa para calcular o consumo médio de um automóvel (media em Km/l), 
		sendo que conhecemos à distância total percorrida e o volume de combustível consumido pare percorrê-la.
		*/
		
//		Double totalDistancia, volCombustivel, total;
//		
//		totalDistancia = Double.parseDouble(
//				JOptionPane.showInputDialog("Informe à distância total percorrida :")
//		);
//		
//		volCombustivel = Double.parseDouble(
//				JOptionPane.showInputDialog("Informe o volume de combustível consumido :")
//		);
//		
//		total = totalDistancia / volCombustivel;
//		
//		System.out.println("fim:" + total + "Km/l");
//		
		/*
		Dado nome, preço de compra e o preço de venda de uma mercadoria. 
		Faça um programa que mostre o nome e o lucro em reais obtido com a venda da mesma.
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
		
		JOptionPane.showMessageDialog(null, nomeProd + " Fim:" + total + "e SEU PORCENTUAL É:" + porcent);
	}
	//sysout
}


