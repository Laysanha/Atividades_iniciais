package faculdade;

import javax.swing.JOptionPane;

public class Dia2Aula2 {
	public static void main(String[] args) {
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe um n?mero de 1 a 12:"));

		if (mes < 1 || mes > 12) {
			JOptionPane.showMessageDialog(null, "Digite um numero valido");
		} else if (mes == 1) {
			JOptionPane.showMessageDialog(null, "Janeiro");
		} else if (mes == 2) {
			JOptionPane.showMessageDialog(null, "Fevereiro");
		} else if (mes == 3) {
			JOptionPane.showMessageDialog(null, "Marco");
		} else if (mes == 4) {
			JOptionPane.showMessageDialog(null, "Abril");
		} else if (mes == 5) {
			JOptionPane.showMessageDialog(null, "Maio");
		} else if (mes == 6) {
			JOptionPane.showMessageDialog(null, "Junho");
		} else if (mes == 7) {
			JOptionPane.showMessageDialog(null, "Julho");
		} else if (mes == 8) {
			JOptionPane.showMessageDialog(null, "Agosto");
		} else if (mes == 9) {
			JOptionPane.showMessageDialog(null, "Setembro");
		} else if (mes == 10) {
			JOptionPane.showMessageDialog(null, "Outubro");
		} else if (mes == 11) {
			JOptionPane.showMessageDialog(null, "Novembro");
		} else if (mes == 12) {
			JOptionPane.showMessageDialog(null, "Dezembro");
		}

	}
}
