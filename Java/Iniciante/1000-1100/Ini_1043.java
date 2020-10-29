package ini_1000_1100;

/* 1043 - TRI�NGULO
 * 
 *  PROBLEMA
 *  Leia 3 valores reais (A, B e C) e verifique se eles formam ou n�o um tri�ngulo. Em caso positivo, 
 *  calcule o per�metro do tri�ngulo e apresente a mensagem:
 *  
 *  Perimetro = XX.X
 *  
 *  Em caso negativo, calcule a �rea do trap�zio que tem A e B como base e C como altura, mostrando a mensagem
 *  
 *  Area = XX.X
 *  
 *  ENTRADA
 *  A entrada cont�m tr�s valores reais.
 *  
 *  SA�DA
 *  O resultado deve ser apresentado com uma casa decimal.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		
		input.close();
		
		if((Math.abs(b - c) < a && a < b + c) && (Math.abs(a - c) < b && b < a + c) 
		    && (Math.abs(a - b) < c && c < a + b)) System.out.printf("Perimetro = %.1f\n", a + b + c);
		else System.out.printf("Area = %.1f\n", ((a + b) * c) / 2);
		
	}

}
