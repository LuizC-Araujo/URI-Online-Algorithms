package ini_1101_1200;

/* SUBSTITUICAO EM VETOR I
 * 
 * PROBLEMA
 * Fa�a um programa que leia um vetor X[10]. Substitua a seguir, todos os valores nulos e negativos do vetor X 
 * por 1. Em seguida mostre o vetor X.
 * 
 * ENTRADA
 * A entrada cont�m 10 valores inteiros, podendo ser positivos ou negativos.
 * 
 * SA�DA
 * Para cada posi��o do vetor, escreva "X[i] = X", onde i � a posi��o do vetor e X � o valor armazenado 
 * naquela posi��o.
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
