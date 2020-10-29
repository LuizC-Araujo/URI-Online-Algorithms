package ini_1000_1100;

/* 1060 - NÚMEROS POSITIVOS
 * 
 * PROBLEMA
 * Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os 
 * valores nulos). A seguir, mostre a quantidade de valores positivos digitados.
 * 
 * ENTRADA
 * Seis valores, negativos e/ou positivos.
 * 
 * SAÍDA
 * Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double numeros[] = {0, 0, 0, 0, 0, 0};
		int contaPositivos = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextDouble();
			if(numeros[i] > 0) contaPositivos++;
		}
		
		input.close();
		
		System.out.println(contaPositivos + " valores positivos");

	}

}
