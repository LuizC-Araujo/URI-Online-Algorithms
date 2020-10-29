package ini_1000_1100;

/* 1045 - TIPOS DE TRIÂNGULOS
 * 
 * PROBLEMA
 * Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A 
 * representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, 
 * com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
 * 		• se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
 * 		• se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
 * 		• se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
 * 		• se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
 * 		• se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
 * 		• se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
 * 
 * ENTRADA
 * A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).
 * 
 * SAÍDA
 * Imprima todas as classificações do triângulo especificado na entrada.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double lado1 = input.nextDouble();
		double lado2 = input.nextDouble();
		double lado3 = input.nextDouble();
		
		input.close();
		
		double a = 0, b = 0, c = 0;
		
		if(lado1 >= lado2 && lado1 >= lado3) {
			a = lado1;
			b = lado2;
			c = lado3;
		}else if(lado2 >= lado1 && lado2 >= lado3) {
			a = lado2;
			b = lado1;
			c = lado3;
		}else if(lado3 >= lado1 && lado3 >= lado2) {
			a = lado3;
			b = lado1;
			c = lado2;
		}
		
		if(a >= b + c) System.out.println("NAO FORMA TRIANGULO");
		else {
			if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) System.out.println("TRIANGULO RETANGULO");
			else if(Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) System.out.println("TRIANGULO OBTUSANGULO");
			else if(Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) System.out.println("TRIANGULO ACUTANGULO");
			
			if(a == b && a == c) System.out.println("TRIANGULO EQUILATERO");
			else if(a == b || a == c || b == c) System.out.println("TRIANGULO ISOSCELES");
		}
	}

}