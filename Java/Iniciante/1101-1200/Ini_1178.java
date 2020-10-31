package ini_1101_1200;

/* 1178 - PREENCHIMENTO DE VETOR III
 * 
 * PROBLEMA
 * Leia um valor X. Coloque este valor na primeira posição de um vetor N[100]. Em cada posição subsequente de N 
 * (1 até 99), coloque a metade do valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o 
 * vetor N.
 * 
 * ENTRADA
 * A entrada contem um valor de dupla precisão com 4 casas decimais.
 * 
 * SAÍDA
 * Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela 
 * posição. Cada valor do vetor deve ser apresentado com 4 casas decimais.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1178 {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		Double N[] = new Double[100];
		
		Double V = input.nextDouble();
		N[0] = V;
		System.out.printf("N[0] = %.4f\n", N[0]);
		for(int i = 1; i < N.length; i++) {
			N[i] = N[i - 1] / 2.0000;
			System.out.printf("N[%d] = %.4f\n", i, N[i]);
		}
		
		input.close();

	}

}
