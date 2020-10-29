package ini_1101_1200;

/* 1145 - SEQUENCIA LOGICA 2
 * 
 * PROBLEMA 
 * Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequ�ncia de 1 at� Y, passando para 
 * a pr�xima linha a cada X n�meros.
 * 
 * ENTRADA
 * O arquivo de entrada cont�m dois valores inteiros, (1 < X < 20) e (X < Y < 100000).
 * 
 * SA�DA
 * Cada sequ�ncia deve ser impressa em uma linha apenas, com 1 espa�o em branco entre cada n�mero, conforme 
 * exemplo abaixo. N�o deve haver espa�o em branco ap�s o �ltimo valor da linha. (PARA 3 99)
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 10 11 12
 * ...
 * 97 98 99
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1145 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt(); 
		int y = input.nextInt();
		int cont = 0;
		
		for(int i = 1; i <= y; i++) {
			System.out.printf("%d", i);
			cont++;
			if(cont == x) {
				cont = 0;
				System.out.println("");
			}else System.out.printf(" ");
		}
		
		input.close();

	}

}
