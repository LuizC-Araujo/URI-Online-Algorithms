package ini_1101_1200;

/* 1145 - SEQUENCIA LOGICA 2
 * 
 * PROBLEMA 
 * Escreva um programa que leia dois valores X e Y. A seguir, mostre uma sequência de 1 até Y, passando para 
 * a próxima linha a cada X números.
 * 
 * ENTRADA
 * O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).
 * 
 * SAÍDA
 * Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número, conforme 
 * exemplo abaixo. Não deve haver espaço em branco após o último valor da linha. (PARA 3 99)
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
