package ini_1000_1100;

/* 1052 - M�S
 * 
 * PROBLEMA
 * Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, deve ser apresentado como 
 * resposta o m�s do ano por extenso, em ingl�s, com a primeira letra mai�scula.
 * 
 * ENTRADA
 * A entrada cont�m um �nico valor inteiro.
 * 
 * SA�DA
 * Imprima por extenso o nome do m�s correspondente ao n�mero existente na entrada, com a primeira letra 
 * em mai�scula.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1052 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int mes = input.nextInt();
		
		input.close();
		
		int nMeses [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		String meses[] = {"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"};
		
		for(int i = 0; i < nMeses.length; i++) {
			if(mes == nMeses[i]) {
				 System.out.println(meses[i]);
				 break;
			}
		}

	}

}
