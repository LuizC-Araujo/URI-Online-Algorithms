package ini_1000_1100;

/* 1095 - SEQUENCIA IJ 1
 * 
 * PROBLEMA
 * Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
 * I=1 J=60
 * I=4 J=55
 * I=7 J=50
 * ...
 * I=? J=0
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

public class Ini_1095 {

	public static void main(String[] args) {
		int j = 60;
		
		for(int i = 1; j >= 0; i += 3) {
			System.out.println("I=" + i +" J=" + j);
			j -= 5;
		}

	}

}
