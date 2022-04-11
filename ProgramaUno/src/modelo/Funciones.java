package modelo;

import javax.swing.JOptionPane;

public class Funciones {
	int vector[] = new int[5];

	public void cargar() {
		for (int i = 0; i < 5; i++) {
			vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Posicion[" + i + "]:"));

		}
	}

	public void impri() {
		String salida = "los datos del arreglo son:\n";
		for (int i = 0; i < 5; i++) {
			salida = salida + vector[i] + " ";
		}
		JOptionPane.showMessageDialog(null, salida);

	}

	public void invertir() {
		int j = vector.length - 1;
		String salid = "los datos invertidos del arreglo son:\n";
		for (int i = 4; i >= 0; i--) {
			salid = salid + vector[i] + " ";
		}
		JOptionPane.showMessageDialog(null, salid);
	}

	public void ordenarBurbuja() {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				if (vector[i] < vector[j]) {
					int numero = vector[i];
					vector[i] = vector[j];
					vector[j] = numero;

				}
			}
		}
	}

	public void secuencial() {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				if (vector[i] > vector[j]) {
					int aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
	}
}
