package ini_1000_1100;

/* 1072 - INTERVALO 2
 * 
 * PROBLEMA
 * Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
 * Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, 
 * mostrando essas informa��es.
 * 
 * ENTRADA
 * A primeira linha da entrada cont�m um valor inteiro N (N < 10000), que indica o n�mero de casos de teste.
 * Cada caso de teste a seguir � um valor inteiro X (-10^7 < X < 10^7).
 * 
 * SA�DA
 * Para cada caso, imprima quantos n�meros est�o dentro (in) e quantos valores est�o fora (out) do intervalo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1072 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int qtde = input.nextInt();
		int n = 0;
		int in = 0, out = 0;
		
		for(int i = 0; i < qtde; i++) {
			n = input.nextInt();
			if(n >= 10 && n <= 20) in++;
			else out++;
		}
		
		input.close();
		
		System.out.println(in + " in");
		System.out.println(out + " out");

	}

}
