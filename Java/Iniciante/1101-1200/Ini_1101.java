package ini_1101_1200;

/*Sequência de Números e Soma
 * 
 * PROBLEMA
 * Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for 
 * menor ou igual a zero). Para cada par lido, mostre a sequência do menor até o maior e a soma dos 
 * inteiros consecutivos entre eles (incluindo o N e M).
 * 
 * ENTRADA
 * O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada 
 * vai conter um número nulo ou negativo.
 * 
 * SAIDA
 * Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme 
 * exemplo abaixo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x, y;
		do {
			x = input.nextInt();
			y = input.nextInt();
			
			if(y > x) {
				int aux = y;
				y = x;
				x = aux;
			}
			if(y <= 0 || x <= 0) break;
			int soma = 0;
			for(int i = y; i < x + 1; i++) {
				System.out.printf("%d ", i);
				soma += i;
			}
			
			System.out.printf("Sum=%d\n", soma);
			
		}while(x > 0 || y > 0);
		
		input.close();
	}

}
