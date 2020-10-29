package ini_1101_1200;

/* 1142 - PUM
 * 
 * PROBLEMA
 * Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão 
 * apresentadas na execução do programa.
 * 
 * ENTRADA
 * O arquivo de entrada contém um número inteiro positivo N.
 * 
 * SAÍDA
 * Imprima a saída conforme o exemplo fornecido.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1142 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n_linhas = input.nextInt(); 
		String pum = "PUM";
		
		for(int i = 1; i < n_linhas * 4 + 1; i++) {
			if(i % 4 != 0) System.out.printf("%d ", i);
			else System.out.println(pum);
			
		}
		
		input.close();

	}

}
