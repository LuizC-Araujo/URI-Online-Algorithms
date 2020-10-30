package ini_1101_1200;

/* 1153 - FATORIAL SIMPLES
 * 
 * PROBLEMA
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. 
 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
 * 
 * ENTRADA
 * A entrada contém um valor inteiro N (0 < N < 13).
 * 
 * SAÍDA
 * A saída contém um valor inteiro, correspondente ao fatorial de N.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1153 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt(), fatorial = 1;
		
		if(N > 0) {
			for(int i = N; i > 0; i--) {
				fatorial *= i;
			}
			System.out.println(fatorial);
		}
		
		input.close();

	}

}
