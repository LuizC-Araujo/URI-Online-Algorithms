package ini_1101_1200;

/* 1158 - SOMA DE IMPARES CONSECUTIVOS III
 * 
 * PROBLEMA
 * Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste
 * de dois inteiros X e Y. Você deve apresentar a soma de Y ímpares consecutivos a partir de X inclusive o 
 * próprio X se ele for ímpar. Por exemplo:
 * para a entrada 4 5, a saída deve ser 45, que é equivalente à: 5 + 7 + 9 + 11 + 13
 * para a entrada 7 4, a saída deve ser 40, que é equivalente à: 7 + 9 + 11 + 13
 * 
 * ENTRADA
 * A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. 
 * Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.
 * 
 * SAÍDA
 * Imprima a soma dos consecutivos números ímpares a partir do valor X.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1158 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int X, Y, cont, soma;
		for(int i = N; i > 0; i--) {
			X = input.nextInt();
			Y = input.nextInt();
			soma = 0;
			cont = 0;
			for(int j = X; cont != Y; j++) {
				if(j % 2 != 0) {
					soma += j;
					cont++;
				}
			}
			
			System.out.println(soma);
		}
		
		input.close();

	}

}
