package ini_1000_1100;

/* 1080 - MAIOR E POSIÇÃO
 * 
 * PROBLEMA
 * Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
 * 
 * ENTRADA
 * O arquivo de entrada contém 100 números inteiros, positivos e distintos.
 * 
 * SAÍDA
 * Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1080 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int n = 0, maior = 0, posicao = 0;
		
		for(int i = 1; i <= 100; i++) {
			n = input.nextInt();
			
			if(n > maior) {
				maior = n;
				posicao = i;
			}
				
		}
		
		System.out.println(maior);
		System.out.println(posicao);
		
		input.close();

	}

}
