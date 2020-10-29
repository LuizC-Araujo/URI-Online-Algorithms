package ini_1000_1100;

/* 1067 - NÚMEROS ÍMPARES
 * 
 * PROBLEMA
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, 
 * inclusive o X, se for o caso.
 * 
 * ENTRADA
 * O arquivo de entrada contém 1 valor inteiro qualquer.
 * 
 * SAÍDA
 * Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1067 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int X = input.nextInt();
		input.close();
		
		for(int i = 1; i <= X; i+=2) System.out.println(i);

	}

}
