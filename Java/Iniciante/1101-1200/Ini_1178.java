package ini_1101_1200;

/* 1178 - PREENCHIMENTO DE VETOR III
 * 
 * PROBLEMA
 * Leia um valor X. Coloque este valor na primeira posi��o de um vetor N[100]. Em cada posi��o subsequente de N 
 * (1 at� 99), coloque a metade do valor armazenado na posi��o anterior, conforme o exemplo abaixo. Imprima o 
 * vetor N.
 * 
 * ENTRADA
 * A entrada contem um valor de dupla precis�o com 4 casas decimais.
 * 
 * SA�DA
 * Para cada posi��o do vetor N, escreva "N[i] = Y", onde i � a posi��o do vetor e Y � o valor armazenado naquela 
 * posi��o. Cada valor do vetor deve ser apresentado com 4 casas decimais.
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
