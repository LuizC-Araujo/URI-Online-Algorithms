package ini_1101_1200;

/* SUBSTITUICAO EM VETOR I
 * 
 * PROBLEMA
 * Faça um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X 
 * por 1. Em seguida mostre o vetor X.
 * 
 * ENTRADA
 * A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.
 * 
 * SAÍDA
 * Para cada posição do vetor, escreva "X[i] = X", onde i é a posição do vetor e X é o valor armazenado 
 * naquela posição.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1172 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int X[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		for(int i = 0; i < X.length; i++) {
			X[i] = input.nextInt();
			if(X[i] < 1) X[i] = 1;
		}
		
		for(int i = 0; i < X.length; i++) {
			System.out.println("X[" + i + "] = " + X[i]);
		}
		input.close();

	}

}
