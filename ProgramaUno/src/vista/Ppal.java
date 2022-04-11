package vista;

import modelo.Funciones;
import javax.swing.JOptionPane;

public class Ppal {
	public static void main(String[] args) {
		Funciones ob = new Funciones();
		int opc;
		do {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog("MENU\n\n1)Cargar\n2)Imprimir\n3)Invertir\n4)Ordenar\n5)salir\n\nDigite opcion:"));
			switch (opc) {
			case 1:
				ob.cargar();
				break;
			case 2:
				ob.impri();
				break;
			case 3:
				ob.invertir();
				break;
			case 4:
				do {
					opc = Integer
							.parseInt(JOptionPane.showInputDialog("MENU\n\n1)Burbuja\n2)Secuencial\n\nDigite opcion:"));
					switch (opc) {
					case 1:
						ob.ordenarBurbuja();
						break;
					case 2:
						ob.secuencial();
						break;

					}
				} while (opc < 0);

			}
		} while (opc != 5);
	}
}
