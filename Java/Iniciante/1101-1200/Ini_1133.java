package ini_1101_1200;

/* 1133 - RESTO DA DIVISAO
 * 
 * PROBLEMA
 * Escreva um programa que leia 2 valores X e Y e que imprima todos os valores entre eles cujo resto da 
 * divisão dele por 5 for igual a 2 ou igual a 3.
 * 
 * ENTRADA
 * O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente.
 * 
 * SAÍDA
 * Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1133 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		input.close();
		
		if(y > x) {
			int aux = y;
			y = x;
			x = aux;
		}
		
		for(int i = y + 1; i < x; i++) 
			if(i % 5 == 2 || i % 5 == 3) System.out.println(i);
				
	}

}
