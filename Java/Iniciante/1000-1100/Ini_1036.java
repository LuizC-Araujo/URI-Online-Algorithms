package ini_1000_1100;

/*1036 - F�RMULA DE BHASKARA
 * 
 * PROBLEMA
 * Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de Bhaskara. Se n�o for 
 * poss�vel calcular as ra�zes, mostre a mensagem correspondente �Impossivel calcular�, caso haja uma 
 * divis�o por 0 ou raiz de numero negativo.
 * 
 * ENTRADA
 * Leia tr�s valores de ponto flutuante (double) A, B e C.
 * 
 * SA�DA
 * Se n�o houver possibilidade de calcular as ra�zes, apresente a mensagem "Impossivel calcular". Caso 
 * contr�rio, imprima o resultado das ra�zes com 5 d�gitos ap�s o ponto, com uma mensagem correspondente 
 * conforme exemplo abaixo. Imprima sempre o final de linha ap�s cada mensagem.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		
		input.close();
		
		double D = Math.pow(B, 2) - 4 * A * C;
		
		if(D < 0 || A == 0) System.out.println("Impossivel calcular");
		else {
			System.out.printf("R1 = %.5f\n", (-B + Math.sqrt(D))/(2*A));
			System.out.printf("R2 = %.5f", (-B - Math.sqrt(D))/(2*A));
		}

	}

}
