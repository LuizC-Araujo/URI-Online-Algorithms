package ini_1101_1200;

/* 1175 - TROCA EM VETOR I
 * 
 * PROBLEMA
 * Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o último, o segundo 
 * elemento com o penúltimo, etc., até trocar o 10º com o 11º. Mostre o vetor modificado.
 * 
 * ENTRADA
 * A entrada contém 20 valores inteiros, positivos ou negativos.
 * 
 * SAÍDA
 * Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado 
 * naquela posição.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1175 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N[] = new int[20];
		int cont = 0;
		int i;
		
		for(i = 0; i < N.length; i++) {
			N[i] = input.nextInt();
		}
		
		
		
		int aux;
		for(i = 19; i >= 10; i--) {
			aux = N[cont];
			N[cont] = N[i];
			N[i] = aux;
			cont++;
		}
		
		for(i = 0; i < N.length; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}
		
		input.close();
	}

}
