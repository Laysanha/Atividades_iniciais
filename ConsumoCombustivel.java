package aula_2;

import javax.swing.JOptionPane;

public class ConsumoCombustivel {
	public static void main(String[] args) {
		Double totalDistancia, volCombustivel, total;
		
		totalDistancia = Double.parseDouble(
				JOptionPane.showInputDialog("Informe à distância total percorrida :")
		);
				volCombustivel = Double.parseDouble(
				JOptionPane.showInputDialog("Informe o volume de combustível consumido :")
		);
		
		total = totalDistancia / volCombustivel;
		
		if (total > 10) {
			JOptionPane.showMessageDialog(null, "Seu carro não é economico!");
		} else {
			JOptionPane.showMessageDialog(null, "Seu carro é economico!");
		}
	}
}
