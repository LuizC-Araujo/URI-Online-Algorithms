package ini_1000_1100;

/* 1064 - POSITIVOS E MÉDIA
 * 
 * PROBLEMA
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, 
 * deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
 * 
 * ENTRADA
 * A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes 
 * números será positivo.
 * 
 * SAÍDA
 * O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média 
 * dos valores positivos digitados.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float numeros[] = {0, 0, 0, 0, 0, 0};
		int contaPositivos = 0;
		float media = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = input.nextFloat();
			if(numeros[i] > 0) {
				contaPositivos++;
				media += numeros[i];
			}
		}
		
		input.close();
		
		System.out.println(contaPositivos + " valores positivos");
		System.out.printf("%.1f", media/contaPositivos);

	}

}
