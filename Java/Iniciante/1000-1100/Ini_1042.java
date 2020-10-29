package ini_1000_1100;

/*1042 - SORT SIMPLES
 * 
 * PROBLEMA
 * Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, 
 * uma linha em branco e em seguida, os valores na sequência como foram lidos.
 * 
 * ENTRADA
 * A entrada contem três números inteiros.
 * 
 * SAÍDA
 * Imprima a saída conforme foi especificado.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1042 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		input.close();
		
		if(a > b && a > c) {
			if(b > c) {
				System.out.println(c);
				System.out.println(b);
				System.out.println(a);
			}else if(c > b) {
				System.out.println(b);
				System.out.println(c);
				System.out.println(a);
			}
		}else if(b > a && b > c) {
			if(a > c) {
				System.out.println(c);
				System.out.println(a);
				System.out.println(b);
			}else if(c > a) {
				System.out.println(a);
				System.out.println(c);
				System.out.println(b);
			}
		}else if(c > a && c > b) {
			if(a > b) {
				System.out.println(b);
				System.out.println(a);
				System.out.println(c);
			}else if(b > a) {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
			}
		}
		System.out.println("");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
