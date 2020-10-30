package ini_1101_1200;

/* 1151 - FIBONACCI F�CIL
 * 
 * PROBLEMA
 * A seguinte sequ�ncia de n�meros 0 1 1 2 3 5 8 13 21... � conhecida como s�rie de Fibonacci. Nessa 
 * sequ�ncia, cada n�mero, depois dos 2 primeiros, � igual � soma dos 2 anteriores. Escreva um algoritmo 
 * que leia um inteiro N (N < 46) e mostre os N primeiros n�meros dessa s�rie.
 * 
 * ENTRADA
 * O arquivo de entrada cont�m um valor inteiro N (0 < N < 46).
 * 
 * SA�DA
 * Os valores devem ser mostrados na mesma linha, separados por um espa�o em branco. N�o deve haver espa�o 
 * ap�s o �ltimo valor.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1151 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int fibo = 0, aux = 0;
		int N = input.nextInt();
		
		if(N > 0) {
			System.out.printf("%d", fibo);
			aux = fibo;
			fibo++;
		}
		for(int i = 0; i < N - 1; i++) {
			System.out.printf(" ", fibo);
			System.out.printf("%d", fibo);
			int aux2 = fibo;
			fibo += aux;
			aux = aux2;
		}
		
		System.out.println("");
			
		
		input.close();

	}

}
