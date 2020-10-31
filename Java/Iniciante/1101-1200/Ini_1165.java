package ini_1101_1200;

/* 1165 - NUMERO PRIMO
 * 
 * PROBLEMA
 * Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo. 
 * Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7.
 * 
 * ENTRADA
 * A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 100), 
 * indicando o número de casos de teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro 
 * X (1 < X ≤ 107), que pode ser ou não, um número primo.
 * 
 * SAÍDA
 * Para cada caso de teste de entrada, imprima a mensagem “X eh primo” ou “X nao eh primo”, de acordo com a 
 * especificação fornecida.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1165 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int X, cont, verificador = 0;
		
		for(int i = 0; i < N; i++) {
			X = input.nextInt();
			cont = 0;
			verificador = 1;
			for(int j = 1; j < X; j++) {
				if(X % j == 0) cont++;
				if(cont > 1) {
					verificador = 2;
					break;
				}
			}
			if(verificador == 2) System.out.println(X + " nao eh primo");
			else if(verificador == 1) System.out.println(X + " eh primo");
		}
		input.close();

	}

}
