package ini_1000_1100;

/* 1075 - RESTO 2
 * 
 * PROBLEMA
 * Leia um valor inteiro N. Apresente todos os n�meros entre 1 e 10000 que divididos por N d�o resto igual a 2.
 * 
 * ENTRADA
 * A entrada cont�m um valor inteiro N (N < 10000).
 * 
 * SA�DA
 * Imprima todos valores que quando divididos por N d�o resto = 2, um por linha.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1075 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		
		input.close();
		
		for(int i = 0; i < 10001; i++) {
			if(i % valor == 2) System.out.println(i);
		}

	}

}
