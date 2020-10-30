package ini_1101_1200;

/* 1151 - FIBONACCI FÁCIL
 * 
 * PROBLEMA
 * A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa 
 * sequência, cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores. Escreva um algoritmo 
 * que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.
 * 
 * ENTRADA
 * O arquivo de entrada contém um valor inteiro N (0 < N < 46).
 * 
 * SAÍDA
 * Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço 
 * após o último valor.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1151 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int fibo = 0, aux = 0;
		int N = input.nextInt();
		
		if(N > 0) {
			System.out.printf("%d", fibo);
			aux = fibo;
			fibo++;
		}
		for(int i = 0; i < N - 1; i++) {
			System.out.printf(" ", fibo);
			System.out.printf("%d", fibo);
			int aux2 = fibo;
			fibo += aux;
			aux = aux2;
		}
		
		System.out.println("");
			
		
		input.close();

	}

}
