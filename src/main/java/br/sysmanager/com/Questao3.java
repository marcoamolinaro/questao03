package br.sysmanager.com;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Questao3 {

	public static void main(String[] args) {
		
		String numeroStr = JOptionPane.showInputDialog("Digite um número inteiro:");
		
		Integer numero = null;

		try {
			numero = Integer.parseInt(numeroStr);
		} catch (Exception e) {
			System.out.println("Você deve digitar um núermo inteiro");
			return;
		}
		
		int amstrong = calcular_numero_amstrong(numeroStr);
		
		System.out.println("Número digitado foi " + numero + " e" + 
		  ((numero ==  amstrong) ? " é um " : " não é ") + 
		  "um número Amstrong");
	}
	
	
	/*
	 * Calcula se um número é Amstrong
	 */
	private static int calcular_numero_amstrong(String numeroStr) {
		String aux = "";
		
		List<String> numeros = new ArrayList<String>();
		
		for (int i = 0; i < numeroStr.length(); i++) {
			aux = numeroStr.substring(i,i+1);
			numeros.add(aux);
		}
		
		Integer n;
		int soma = 0;
		
		for(String s : numeros) {
			n = Integer.parseInt(s);
			soma += Math.pow(n, 3);
		}
		
		return soma;
	}

}
