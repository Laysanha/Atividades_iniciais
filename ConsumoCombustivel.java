package aula_2;

import javax.swing.JOptionPane;

public class ConsumoCombustivel {
	public static void main(String[] args) {
		Double totalDistancia, volCombustivel, total;
		
		totalDistancia = Double.parseDouble(
				JOptionPane.showInputDialog("Informe � dist�ncia total percorrida :")
		);
				volCombustivel = Double.parseDouble(
				JOptionPane.showInputDialog("Informe o volume de combust�vel consumido :")
		);
		
		total = totalDistancia / volCombustivel;
		
		if (total > 10) {
			JOptionPane.showMessageDialog(null, "Seu carro n�o � economico!");
		} else {
			JOptionPane.showMessageDialog(null, "Seu carro � economico!");
		}
	}
}
