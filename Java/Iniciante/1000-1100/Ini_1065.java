package ini_1000_1100;

/* 1065 - PARES ENTRE CINCO NÚMEROS
 * 
 * PROBLEMA
 * Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre 
 * esta informação.
 * 
 * ENTRADA
 * O arquivo de entrada contém 5 valores inteiros quaisquer.
 * 
 * SAÍDA
 * Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1065 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double numeros[] = {0, 0, 0, 0, 0};
		int contaPares = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextDouble();
			if(numeros[i] % 2 == 0) contaPares++;
		}
		
		input.close();
		
		System.out.println(contaPares + " valores pares");

	}

}
