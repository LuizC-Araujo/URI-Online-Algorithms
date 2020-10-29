package ini_1101_1200;

/* 1132 - MULTIPLOS DE 13
 * 
 * PROBLEMA
 * Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos 
 * de 13 entre X e Y, incluindo ambos.
 * 
 * ENTRADA
 * O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente em ordem crescente.
 * 
 * SAÍDA
 * Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores lidos na entrada, 
 * inclusive ambos se for o caso.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1132 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int soma = 0;
		
		if(y > x) {
			int aux = y;
			y = x;
			x = aux;
		}
		
		for(int i = y; i <= x; i++) 
			if(i % 13 != 0) soma += i;

		System.out.println(soma);
		input.close();
	}

}
