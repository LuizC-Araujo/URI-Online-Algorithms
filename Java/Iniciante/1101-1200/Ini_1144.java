package ini_1101_1200;

/* 1144 - SEQUENCIA LOGICA
 * 
 * PROBLEMA
 * Escreva um programa que leia um valor inteiro N. N * 2 linhas de sa�da ser�o apresentadas na execu��o do 
 * programa, seguindo a l�gica do exemplo abaixo. Para valores com mais de 6 d�gitos, todos os d�gitos devem 
 * ser apresentados.
 * 
 * ENTRADA
 * O arquivo de entrada cont�m um n�mero inteiro positivo N (1 < N < 1000).
 * 
 * SA�DA
 * Imprima a sa�da conforme o exemplo fornecido.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1144 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n_linhas = input.nextInt(); 
		
		for(int i = 1; i < n_linhas + 1; i++) {
			System.out.println((i) + " " + ((int) Math.pow(i, 2)) + " " + (((int) Math.pow(i, 3))));
			System.out.println((i) + " " + ((int) Math.pow(i, 2) + 1) + " " + (((int) Math.pow(i, 3) + 1)));
		}
		
		input.close();

	}

}
