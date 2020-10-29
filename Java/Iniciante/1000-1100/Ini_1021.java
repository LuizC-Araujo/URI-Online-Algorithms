package ini_1000_1100;

/*1021 - NOTAS E MOEDAS
 * 
 * PROBLEMA
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
 * A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
 * As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 
 * 0.05 e 0.01. A seguir mostre a relação de notas necessárias.
 * 
 * ENTRADA
 * O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
 * 
 * SAÍDA
 * Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, 
 * conforme exemplo fornecido.
 * 
 * Obs: Utilize ponto (.) para separar a parte decimal.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.*;

public class Ini_1021 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextFloat();
		
		sc.close();
		
		valor += 0.0001;
		
		int notas[] = {100, 50, 20, 10, 5, 2};
		double moedas[] = {100, 50, 25, 10, 5, 1};
		
		System.out.println("NOTAS:");
		for (float i : notas) {
			int qtde_notas = (int) (valor/i);
			System.out.printf("%d nota(s) de R$ %.2f\n", qtde_notas, i);
			valor -= qtde_notas * i;
		}
		valor *= 100;
		System.out.println("MOEDAS:");
		for (double d : moedas) {
			int qtde_moedas = (int) (valor / d);
			System.out.printf("%d moeda(s) de R$ %.2f\n", qtde_moedas, d / 100);
			valor -= qtde_moedas * d;
		}
	}

}
