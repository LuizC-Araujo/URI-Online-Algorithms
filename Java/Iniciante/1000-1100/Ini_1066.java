package ini_1000_1100;

/* 1066 - PARES, ÍMPARES, POSITIVOS E NEGATIVOS
 * 
 * PROBLEMA
 * Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados 
 * foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.
 * 
 * ENTRADA
 * O arquivo de entrada contém 5 valores inteiros quaisquer.
 * 
 * SAÍDA
 * Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha 
 * após cada uma.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1066 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double numeros[] = {0, 0, 0, 0, 0};
		int contaPares = 0;
		int contaImpares = 0;
		int contaPositivos = 0;
		int contaNegativos = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextDouble();
			if(numeros[i] % 2 == 0)	contaPares++;
			else contaImpares++;
			
			if(numeros[i] > 0) contaPositivos++;
			else if(numeros[i] < 0) contaNegativos++;
		}
		
		input.close();
		
		System.out.println(contaPares + " valor(es) par(es)");
		System.out.println(contaImpares + " valor(es) impar(es)");
		System.out.println(contaPositivos + " valor(es) positivo(s)");
		System.out.println(contaNegativos + " valor(es) negativo(s)");

	}

}
