package ini_1101_1200;

/* 1154 - Idades
 * 
 * PROBLEMA
 * Fa�a um algoritmo para ler um n�mero indeterminado de dados, contendo cada um, a idade de um indiv�duo. 
 * O �ltimo dado, que n�o entrar� nos c�lculos, cont�m o valor de idade negativa. Calcular e imprimir a idade 
 * m�dia deste grupo de indiv�duos.
 * 
 * ENTRADA
 * A entrada cont�m um n�mero indeterminado de inteiros. A entrada ser� encerrada quando um valor negativo 
 * for lido.
 * 
 * SA�DA
 * A sa�da cont�m um valor correspondente � m�dia de idade dos indiv�duos.
 * A m�dia deve ser impressa com dois d�gitos ap�s o ponto decimal.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1154 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade, contIdades = 0, somaIdades = 0;
		
		do {
			idade = input.nextInt();
			if(idade >= 0) {
				contIdades++;
				somaIdades += idade;
			}
		}while(idade >= 0);
		
		System.out.printf("%.2f\n", (float) somaIdades / contIdades);
		
		input.close();

	}

}
