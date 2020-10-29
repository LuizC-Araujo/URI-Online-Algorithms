package ini_1000_1100;

/* 1070 - SEIS NÚMEROS ÍMPARES
 * 
 * PROBLEMA
 * Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor 
 * por linha, inclusive o X ser for o caso.
 * 
 * ENTRADA
 * A entrada será um valor inteiro positivo.
 * 
 * SAÍDA
 * A saída será uma sequência de seis números ímpares.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1070 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		
		input.close();
		int cont = 0;
		for(int i = X; i <= X + 12 ; i++) {
			if(i % 2 != 0) {
				cont++;
				System.out.println(i);
			}
			if(cont == 6) break;
			
		}

	}

}
