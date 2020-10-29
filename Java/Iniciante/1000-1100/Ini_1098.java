package ini_1000_1100;

/* 1097 - SEQUENCIA IJ 4
 * 
 * PROBLEMA
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 * I=0 J=1
 * I=0 J=2
 * I=0 J=3
 * I=0.2 J=1.2
 * I=0.2 J=2.2
 * I=0.2 J=3.2
 * .....
 * I=2 J=?
 * I=2 J=?
 * I=2 J=?
 * 
 * ENTRADA
 * Não há nenhuma entrada neste problema.
 * 
 * SAÍDA
 * Imprima a sequencia conforme exemplo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;

public class Ini_1098 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int k = 0;
		int verificar = 0;
		
		for(int i = 0; i <= 2; i++) {
			k++;
			for(int j = k; j <= k + 2; j++) {
				System.out.println("I=" + i + " J=" + j);
				verificar = j;
			}
			if(verificar < 5) {
				for(int j = k; j <= k + 2; j++) System.out.printf("I=%.1f J=%.1f\n", i + 0.2, j + 0.2);
				for(int j = k; j <= k + 2; j++) System.out.printf("I=%.1f J=%.1f\n", i + 0.4, j + 0.4);
				for(int j = k; j <= k + 2; j++) System.out.printf("I=%.1f J=%.1f\n", i + 0.6, j + 0.6);
				for(int j = k; j <= k + 2; j++) System.out.printf("I=%.1f J=%.1f\n", i + 0.8, j + 0.8);
			}
		}

	}

}
