package vista;

import modelo.*;
import javax.swing.JOptionPane;

public class vista {
	public static void main(String[] args) {
		Funciones ob1 = null;
		Funciones ob2 = null;
		Funciones ob3 = null;
		int opc;
		int N = 1;
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("menu\n1.Cargar\n2.Imprimir\n3.salir:"));
			switch (opc) {
			case 1:
				do {
					opc = Integer.parseInt(
						JOptionPane.showInputDialog("menu\n1.Aleatorio\n2.Teclado\n3.Multiplicar\n4.Volver:"));
					switch (opc) {
					case 1:
						JOptionPane.showMessageDialog(null, "Cargado");
						ob1 = new Funciones();
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Cargado");
						ob2 = new Funciones(N);
						break;
					case 3:
						ob3 = new Funciones(ob1, ob2);
						JOptionPane.showMessageDialog(null, "Cargado");
						
						break;
					}
				} while (opc != 4);
				break;
			case 2:
				do {
					opc = Integer.parseInt(JOptionPane.showInputDialog("menu\n1.001\n2.002\n3.003\n4.Volver:"));
					switch (opc) {
					case 1:
						ob1.imprimirUno(ob1);
						break;
					case 2:
						ob2.imprimirDos(ob2);
						break;
					case 3:
						ob3.imprimirTres(ob3);
						break;
					}
				} while (opc != 4);
				break;
			}

		} while (opc != 3);
	}
}
