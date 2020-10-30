package ini_1101_1200;

/* 1159 - SOMA DE PARES CONSECUTIVOS
 * 
 * PROBLEMA
 * O programa deve ler um valor inteiro X indefinidas vezes. (O programa ir� parar quando o valor de X for igual 
 * a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X , se for par. Se 
 * o valor de entrada for 4, por exemplo, a sa�da deve ser 40, que � o resultado da opera��o: 4+6+8+10+12, 
 * enquanto que se o valor de entrada for 11, por exempo, a sa�da deve ser 80, que � a soma de 12+14+16+18+20.
 * 
 * ENTRADA
 * O arquivo de entrada cont�m muitos valores inteiros. O �ltimo valor do arquivo � zero.
 * 
 * SA�DA
 * Imprima a saida conforme a explica��o acima e o exemplo abaixo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1159 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int X, cont, soma;
		X = 1;
		do {
			X = input.nextInt();
			if(X == 0) break;
			cont = soma = 0;
			for(int i = X; cont < 5; i++) {
				if(i % 2 == 0) {
					soma += i;
					cont++;
				}
			}
			System.out.println(soma);
		}while(X != 0);
		
		input.close();

	}

}
