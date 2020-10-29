package ini_1000_1100;

/* 1071 - SOMA DE ÍMPARES CONSECUTIVOS
 * 
 * PROBLEMA
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
 * 
 * ENTRADA
 * O arquivo de entrada contém dois valores inteiros.
 * 
 * SAÍDA
 * O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão 
 * entre os valores fornecidos na entrada que deverá caber em um inteiro.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1071 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		int Y = input.nextInt();
		
		input.close();
		
		int soma = 0;
		
		if(Y > X) {
			int a = Y;
			Y = X;
			X = a;
		}
		
		for(int i = Y + 1; i < X; i++) {
			if(i % 2 != 0) soma += i;
		}
		
		System.out.println(soma);

	}

}
