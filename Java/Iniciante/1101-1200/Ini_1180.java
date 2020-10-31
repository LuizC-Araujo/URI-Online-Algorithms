package ini_1101_1200;

/* 1180 - MENOR E POSIÇÃO
 * 
 * PROBLEMA
 * Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N]. A seguir, leia cada um dos 
 * valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor, mostrando esta 
 * informação.
 * 
 * ENTRADA
 * A primeira linha de entrada contem um único inteiro N (1 < N < 1000), indicando o número de elementos que 
 * deverão ser lidos em seguida para o vetor X[N] de inteiros. A segunda linha contém cada um dos N valores, 
 * separados por um espaço.
 * 
 * SAÍDA
 * A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido na entrada. 
 * A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do vetor na qual se 
 * encontra o menor valor lido, lembrando que o vetor inicia na posição zero.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1180 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int X[] = new int[N], menor = 999999999, posicao = -1;
	
		for(int i = 0; i < X.length; i++) {
			X[i] = input.nextInt();
			if(X[i] < menor) {
				menor = X[i];
				posicao = i;
			}
		}
		
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
		
		input.close();

	}

}
