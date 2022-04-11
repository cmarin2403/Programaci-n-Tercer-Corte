package modelo;

import java.util.Random;
import javax.swing.JOptionPane;

public class Funciones {
	 int matriz[][];

	public Funciones() {
		matriz = new int[3][3];
		Random aleatorio = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = aleatorio.nextInt(99);
			}
		}
	}

	public Funciones(int n) {
		matriz = new int[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite dato:"));
			}
		}
	}

	public Funciones(Funciones ob1, Funciones  ob2 ) {
		matriz = new int[3][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				for (int j2 = 0; j2 < matriz.length; j2++) {

					matriz[i][j] += ob1.matriz[i][j2] * ob2.matriz[j2][i];
				}
			}
		}
	}
	
	public void imprimirUno(Funciones ob1) {
		String salida ="lOS DATOS SON: \n";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				salida += ob1.matriz[i][j]+ " ";
			}
			salida +="\n";
		}
			JOptionPane.showInternalMessageDialog(null, salida);
	}
	public void imprimirDos(Funciones ob2) {
		String salida ="lOS DATOS SON: \n";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				salida += ob2.matriz[i][j]+ " ";
			}
			salida +="\n";
		}
			JOptionPane.showInternalMessageDialog(null, salida);
	}
	public void imprimirTres(Funciones ob3) {
		String salida ="lOS DATOS SON: \n";
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				salida += ob3.matriz[i][j]+ " ";
			}
			salida +="\n";
		}
			JOptionPane.showInternalMessageDialog(null, salida);
	}
}
