package br.com.erickfreire.caraoucoroa;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class CaraOuCoroa {
	
	public static int cara = 0;
	public static int coroa = 0;

	public static void main(String[] args) {
		
		
		int controlador = 0;		
		String entrada;
		
		JOptionPane.showMessageDialog(null, "Programa que simula jogadas de moedas: ");
		
		while(controlador != 9) {
			
			entrada = JOptionPane.showInputDialog("Escolha uma opção: \n\n\n"
					                            + "1 - Para jogar a moeda\n"
					                            + "9 - Para finalizar o jogo\n\n\n\n");
			
			controlador = Integer.parseInt(entrada);
			
			if(controlador == 1)
			   caraOuCoroa(controlador);
			
		}	
		
		mostraQuantidade();

	}
	
	public static void caraOuCoroa(int c) {
		SecureRandom numeroAleatorio = new SecureRandom();
		
		int numero;
		
		numero = 1 + numeroAleatorio.nextInt(2);
		
		if(numero == 1) {
			JOptionPane.showMessageDialog(null, "Cara");
			cara++;
		} else {
			if(numero == 2) {
				JOptionPane.showMessageDialog(null, "Coroa");
				coroa++;
			}
		}
	}
	
	public static void mostraQuantidade() {
		String msg = String.format("Quantas vezes saiu Cara: %d\n\n"
				                 + "Quantas Vezes saiu Coroa: %d\n\n", cara, coroa);
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
