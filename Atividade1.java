package aula2;

import javax.swing.JOptionPane;

public class Atividade1 {
	public static void main(String[] args) {
		int mes = Integer.parseInt(
				JOptionPane.showInputDialog("Informe um n�mero de 1 a 12:"));
		
		if (mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "Inv�lido");
		} else {
			if (mes == 1 ) {
				JOptionPane.showMessageDialog(null, "Janeiro");
			}
			if (mes == 2 ) {
				JOptionPane.showMessageDialog(null, "Fevereiro");
			}
			if (mes == 3 ) {
				JOptionPane.showMessageDialog(null, "Mar�o");
			}
			if (mes == 4 ) {
				JOptionPane.showMessageDialog(null, "Abril");
			}
		}
	}
}
