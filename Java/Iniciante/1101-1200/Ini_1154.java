package ini_1101_1200;

/* 1154 - Idades
 * 
 * PROBLEMA
 * Faça um algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. 
 * O último dado, que não entrará nos cálculos, contém o valor de idade negativa. Calcular e imprimir a idade 
 * média deste grupo de indivíduos.
 * 
 * ENTRADA
 * A entrada contém um número indeterminado de inteiros. A entrada será encerrada quando um valor negativo 
 * for lido.
 * 
 * SAÍDA
 * A saída contém um valor correspondente à média de idade dos indivíduos.
 * A média deve ser impressa com dois dígitos após o ponto decimal.
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
