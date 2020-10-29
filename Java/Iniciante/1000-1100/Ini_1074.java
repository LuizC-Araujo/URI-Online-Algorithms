package ini_1000_1100;

/* 1074 - PAR OU ÍMPAR
 * 
 * PROBLEMA
 * Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada 
 * valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo 
 * (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descrição correta seja 
 * (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.
 * 
 * ENTRADA
 * A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. 
 * Cada caso de teste a seguir é um valor inteiro X (-10^7 < X < 10^7).
 * 
 * SAÍDA
 * Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras 
 * deverão ser maiúsculas e sempre deverá haver um espaço entre duas palavras impressas na mesma linha.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1074 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int qtde = input.nextInt();
		int numeros = 0;
		
		for(int i = 0; i < qtde; i++) {
			numeros = input.nextInt();
			if(numeros % 2 == 0 && numeros > 0) System.out.println("EVEN POSITIVE");
			else if(numeros % 2 == 0 && numeros < 0) System.out.println("EVEN NEGATIVE");
			else if(numeros % 2 != 0 && numeros > 0) System.out.println("ODD POSITIVE");
			else if(numeros % 2 != 0 && numeros < 0) System.out.println("ODD NEGATIVE");
			else System.out.println("NULL");
			
		}
		
		input.close();

	}

}
