package ini_1101_1200;

/* 1144 - SEQUENCIA LOGICA
 * 
 * PROBLEMA
 * Escreva um programa que leia um valor inteiro N. N * 2 linhas de saída serão apresentadas na execução do 
 * programa, seguindo a lógica do exemplo abaixo. Para valores com mais de 6 dígitos, todos os dígitos devem 
 * ser apresentados.
 * 
 * ENTRADA
 * O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).
 * 
 * SAÍDA
 * Imprima a saída conforme o exemplo fornecido.
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
