package ini_1000_1100;

/*1038 - LANCHE
 * 
 * PROBLEMA
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
 * A seguir, calcule e mostre o valor da conta a pagar.
 * CODIGO * ESPECIFICAÇÃO * PREÇO
 * 1      * HOTDOG        * R$ 4.00
 * 2      * X-SALADA      * R$ 4.50
 * 3      * X-BACON       * R$ 5.00
 * 4      * TORRADA SIMP  * R$ 2.00
 * 5      * REFRIGERANTE  * R$ 1.50
 * 
 * ENTRADA
 * O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item 
 * conforme tabela acima. 
 * 
 * SAÍDA
 * O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após 
 * o ponto decimal.
 *
 *
 *
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int cod = input.nextInt();
		int qtde = input.nextInt();
		input.close();
		
		if(cod == 1) System.out.printf("Total: R$ %.2f\n", qtde * 4.0);
		else if(cod == 2) System.out.printf("Total: R$ %.2f\n", qtde * 4.5);
		else if(cod == 3) System.out.printf("Total: R$ %.2f\n", qtde * 5.0);
		else if(cod == 4) System.out.printf("Total: R$ %.2f\n", qtde * 2.0);
		else if(cod == 5) System.out.printf("Total: R$ %.2f\n", qtde * 1.5);

	}

}
