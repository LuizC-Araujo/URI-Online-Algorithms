package ini_1000_1100;

/* 1097 - SEQUENCIA IJ 3
 * 
 * PROBLEMA
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 * I=1 J=7
 * I=1 J=6
 * I=1 J=5
 * I=3 J=9
 * I=3 J=8
 * I=3 J=7
 * ...
 * I=9 J=15
 * I=9 J=14
 * I=9 J=13
 * 
 * ENTRADA
 * Não há nenhuma entrada neste problema.
 * 
 * SAÍDA
 * Imprima a sequencia conforme exemplo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

public class Ini_1097 {

	public static void main(String[] args) {
		int k = 5;
		
		for(int i = 1; i <= 9; i += 2) {
			k += 2;
			for(int j = k; j >= k - 2; j--) System.out.println("I=" + i + " J=" + j);
			
		}

	}

}
