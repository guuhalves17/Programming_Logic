package exerclogic.executavel;

import javax.swing.JOptionPane;

public class SomaNumPares {
	
	/* Escreva um programa que receba um número inteiro N e calcule a soma de todos os números pares de 1 a N.
	   Exemplo: Se N = 10, a soma deve ser 2 + 4 + 6 + 8 + 10 = 30.*/	
	
	public static void main(String[] args) {
		
		String numeroDigitado = JOptionPane.showInputDialog(null,"Digite o numero: ");
		
		int numero = Integer.parseInt(numeroDigitado);
		
		int somaPares = 0;
		
		int contador = 1;
		
		while(contador <= numero) {
			
			if(contador % 2 == 0 ) {
				somaPares = somaPares + contador;
			}
			
			contador++;
		}
		
		JOptionPane.showMessageDialog(null, "A soma dos numeros pares de 1 a " + numero + " é: " + somaPares);
		
	}
}
