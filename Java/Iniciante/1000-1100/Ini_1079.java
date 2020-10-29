package ini_1000_1100;

/* 1079 - MÉDIAS PONDERADAS
 * 
 * PROBLEMA
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste 
 * consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada 
 * um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e 
 * o terceiro valor tem peso 5.
 * 
 * ENTRADA
 * O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso 
 * de teste com três valores com uma casa decimal cada valor.
 * 
 * SAÍDA
 * Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for(int i = 0; i < N; i++) {
			float notas[] = {0, 0, 0};
			float media = 0;
			
			for(int j = 0; j < 3; j++) notas[j] = input.nextFloat();
			
			media = ((notas[0] * 2) + (notas[1] * 3) + (notas[2] * 5)) / 10;
			
			System.out.printf("%.1f\n", media);
		}
		
		input.close();

	}

}
