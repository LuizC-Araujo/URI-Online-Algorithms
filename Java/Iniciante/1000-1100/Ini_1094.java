package ini_1000_1100;

/* 1094 - EXPERIÊNCIAS
 * 
 * PROBLEMA
 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para 
 * organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, 
 * quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas 
 * informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada 
 * e a quantidade de cobaias utilizadas em cada experimento.
 * 
 * ENTRADA
 * A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a 
 * seguir. Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de 
 * cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo 
 * C:Coelho).
 * 
 * SAÍDA
 * Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada 
 * uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois 
 * dígitos após o ponto.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		char animal;
		int qtdeAnimal = 0, qtdeCoelhos = 0, qtdeRatos = 0, qtdeSapos = 0, total = 0;
		
		for(int i = 0; i < N; i++) {
			qtdeAnimal = input.nextInt();
			animal = input.next().charAt(0);
			total += qtdeAnimal;
			if(animal == 'C') qtdeCoelhos += qtdeAnimal;
			else if(animal == 'R') qtdeRatos += qtdeAnimal;
			else qtdeSapos += qtdeAnimal;
		}
		
		input.close();
		
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + qtdeCoelhos);
		System.out.println("Total de ratos: " + qtdeRatos);
		System.out.println("Total de sapos: " + qtdeSapos);
		System.out.printf("Percentual de coelhos: %.2f %%\n", (float) qtdeCoelhos / total * 100);
		System.out.printf("Percentual de ratos: %.2f %%\n", (float) qtdeRatos / total * 100);
		System.out.printf("Percentual de sapos: %.2f %%\n", (float) qtdeSapos / total * 100);

	}

}
