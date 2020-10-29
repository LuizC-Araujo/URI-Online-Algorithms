package ini_1000_1100;

/* 1046 - TEMPO DE JOGO
 * 
 * PROBLEMA
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo 
 * pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 * 
 * ENTRADA
 * A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
 * 
 * SAÍDA
 * Apresente a duração do jogo conforme exemplo abaixo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int inicio = input.nextInt();
		int fim = input.nextInt();
		
		input.close();
		
		if(inicio < fim) System.out.println("O JOGO DUROU " + (fim - inicio) + " HORA(S)");
		else if(inicio > fim) System.out.println("O JOGO DUROU " + (24 - inicio + fim) + " HORA(S)");
		else System.out.println("O JOGO DUROU " + 24 + " HORA(S)");

	}

}
