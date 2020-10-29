package ini_1000_1100;

/* 1074 - PAR OU �MPAR
 * 
 * PROBLEMA
 * Leia um valor inteiro N. Este valor ser� a quantidade de valores que ser�o lidos em seguida. Para cada 
 * valor lido, mostre uma mensagem em ingl�s dizendo se este valor lido � par (EVEN), �mpar (ODD), positivo 
 * (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descri��o correta seja 
 * (EVEN NULL), pois por defini��o zero � par, seu programa dever� imprimir apenas NULL.
 * 
 * ENTRADA
 * A primeira linha da entrada cont�m um valor inteiro N(N < 10000) que indica o n�mero de casos de teste. 
 * Cada caso de teste a seguir � um valor inteiro X (-10^7 < X < 10^7).
 * 
 * SA�DA
 * Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras 
 * dever�o ser mai�sculas e sempre dever� haver um espa�o entre duas palavras impressas na mesma linha.
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
