package ini_1101_1200;

/* 1116 - DIVIDINDO X POR Y
 * 
 * PROBLEMA
 * Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso 
 * não for possível mostre a mensagem “divisao impossivel” para os valores em questão.
 * 
 * ENTRADA
 * A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que 
 * serão lidos em seguida.
 * 
 * SAÍDA
 * Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” 
 * caso não seja possível efetuar o cálculo. 
 * Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. 
 * Utilize cast :)
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int x, y;
		
		for(int i = 0; i < N; i++) {
			x = input.nextInt();
			y = input.nextInt();
			
			if(y == 0) System.out.println("divisao impossivel");
			else System.out.printf("%.1f\n", ((float) x / y));
		}
		
		input.close();

	}

}
