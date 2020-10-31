package ini_1101_1200;

/* 1177 - PREENCHIMENTO DE VETOR II
 * 
 * PROBLEMA
 * Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 
 * repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.
 * 
 * ENTRADA
 * A entrada contém um valor inteiro T (2 ≤ T ≤ 50).
 * 
 * SAÍDA
 * Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o valor armazenado 
 * naquela posição.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1177 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N[] = new int[1000];
		int T = input.nextInt();
		int cont = 0;
		
		for(int i = 0; i < N.length; i++) {
			if(cont == T)
				cont = 0;
			N[i] = cont;
			System.out.println("N[" + i + "] = " + N[i]);
			cont++;
		}
		input.close();

	}

}
