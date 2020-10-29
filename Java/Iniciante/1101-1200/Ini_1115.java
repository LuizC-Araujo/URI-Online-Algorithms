package ini_1101_1200;

/* 1115 - QUADRANTE
 * 
 * PROBLEMA
 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo ser� encerrado quando 
 * pelo menos uma de duas coordenadas for NULA (nesta situa��o sem escrever mensagem alguma).
 * 
 * ENTRADA
 * A entrada cont�m v�rios casos de teste. Cada caso de teste cont�m 2 valores inteiros.
 * 
 * SA�DA
 * Para cada caso de teste mostre em qual quadrante do sistema cartesiano se encontra a coordenada lida, 
 * conforme o exemplo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1115 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		do {
			x = input.nextInt();
			y = input.nextInt();
					
			if(x > 0 && y > 0) System.out.println("primeiro");
			else if(x < 0 && y > 0) System.out.println("segundo");
			else if(x < 0 && y < 0) System.out.println("terceiro");
			else if(x > 0 && y < 0) System.out.println("quarto");
			
		}while(x != 0 || y != 0);
		
		input.close();

	}

}
