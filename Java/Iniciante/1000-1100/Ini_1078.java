package ini_1000_1100;

/* 1078 - TABUADA
 * 
 * PROBLEMA
 * Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
 * 1 x N = N      2 x N = 2N        ...       10 x N = 10N
 * 
 * ENTRADA
 * A entrada cont�m um valor inteiro N (2 < N < 1000).
 * 
 * SA�DA
 * Imprima a tabuada de N, conforme o exemplo fornecido.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1078 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		input.close();
		
		for(int i = 1; i < 11; i++) System.out.println(i + " x " + N + " = " + (i * N));

	}

}
