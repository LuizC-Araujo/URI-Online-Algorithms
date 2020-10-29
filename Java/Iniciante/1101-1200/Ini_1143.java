package ini_1101_1200;

/* 1143 - QUADRADO E AO CUBO
 * 
 * PROBLEMA
 * Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N � a quantidade de linhas de sa�da 
 * que ser�o apresentadas na execu��o do programa.
 * 
 * ENTRADA
 * O arquivo de entrada cont�m um n�mero inteiro positivo N.
 * 
 * SA�DA
 * Imprima a sa�da conforme o exemplo fornecido. (para N = 5)
 * 1 1 1
 * 2 4 8
 * 3 9 27
 * 4 16 64
 * 5 25 125
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1143 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n_linhas = input.nextInt(); 
		
		for(int i = 1; i < n_linhas + 1; i++) 
			System.out.println((i) + " " + ((int) Math.pow(i, 2) + " " + ((int) Math.pow(i, 3))));
		
		input.close();

	}

}
