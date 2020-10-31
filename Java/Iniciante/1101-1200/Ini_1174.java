package ini_1101_1200;

/* 1174 - SELECAO EM VETORES I
 * 
 * PROBLEMA 
 * Faça um programa que leia um vetor A[100]. No final, mostre todas as posições do vetor que armazenam um valor 
 * menor ou igual a 10 e o valor armazenado em cada uma das posições.
 * 
 * ENTRADA
 * A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.
 * 
 * SAÍDA
 * Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor e x é o valor 
 * armazenado na posição, com uma casa após o ponto decimal.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;
import java.util.Locale;

public class Ini_1174 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float A[] = new float[100];
		
		for(int i = 0; i < A.length; i++) {
			A[i] = input.nextFloat();
		}
		input.close();
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] <= 10) {
				System.out.printf("A[%d] = %.1f\n", i, A[i]);
			}
		}
	}

}
