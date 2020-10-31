package ini_1101_1200;

/* 1175 - TROCA EM VETOR I
 * 
 * PROBLEMA
 * Fa�a um programa que leia um vetor N[20]. Troque a seguir, o primeiro elemento com o �ltimo, o segundo 
 * elemento com o pen�ltimo, etc., at� trocar o 10� com o 11�. Mostre o vetor modificado.
 * 
 * ENTRADA
 * A entrada cont�m 20 valores inteiros, positivos ou negativos.
 * 
 * SA�DA
 * Para cada posi��o do vetor N, escreva "N[i] = Y", onde i � a posi��o do vetor e Y � o valor armazenado 
 * naquela posi��o.
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
