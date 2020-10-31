package ini_1101_1200;

/* 1164 - NUMERO PERFEITO
 * 
 * PROBLEMA
 * Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos 
 * próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é 
 * igual a 6. Sua tarefa é escrever um programa que imprima se um determinado número é perfeito ou não.
 * 
 * ENTRADA
 * A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 20), 
 * indicando o número de casos de teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro 
 * X (1 ≤ X ≤ 108), que pode ser ou não, um número perfeito.
 * 
 * SAÍDA
 * Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito” ou “X nao eh perfeito”, de acordo 
 * com a especificação fornecida.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1164 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int X, P;
		
		for(int i = 0; i < N; i++) {
			X = input.nextInt();
			P = 0;
			for(int j = 1; j < X; j++) {
				if(X % j == 0) {
					P += j;
				}
			}
			if(P == X) System.out.println(X + " eh perfeito");
			else System.out.println(X + " nao eh perfeito");
		}
		
		input.close();

	}

}
