package ini_1000_1100;

/* 1099 - SOMA DE ÍMPARES CONSECUTIVOS II
 * 
 * PROBLEMA
 * Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste 
 * consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.
 * 
 * ENTRADA
 * A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. Cada 
 * caso de teste consiste em uma linha contendo dois inteiros X e Y.
 * 
 * SAÍDA
 * Imprima a soma de todos valores ímpares entre X e Y.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1099 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		
		int N = input.nextInt();
		int soma = 0;
		
		for(int i = 0; i < N; i++) {
			int X = input.nextInt();
			int Y = input.nextInt();
			
			if(Y < X) {
				int aux = Y;
				Y = X;
				X = aux;
			}
			soma = 0;
			for(int j = X + 1; j < Y; j++) {
				if(j % 2 != 0) soma += j;
			}
			
			System.out.println(soma);
		}
		
		input.close();

	}

}
