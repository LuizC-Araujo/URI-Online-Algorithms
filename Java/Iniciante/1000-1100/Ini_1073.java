package ini_1000_1100;

/* 1073 - QUADRADO DE PARES
 * 
 * PROBLEMA
 * Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, 
 * se for o caso.
 * 
 * ENTRADA
 * A entrada contém um valor inteiro N (5 < N < 2000).
 * 
 * SAÍDA
 * Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.
 * Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o 
 * que ocasionará resposta errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1073 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		
		input.close();
		
		for(int i = 1; i <= valor; i++) {
			if(i % 2 == 0) System.out.println(i + "^2 = " + (int) Math.pow(i, 2));
		}

	}

}
