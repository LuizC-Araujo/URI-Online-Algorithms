package ini_1101_1200;

/* 1156 - SEQUENCIA S II
 * 
 * PROBLEMA
 * Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
 * S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?
 * 
 * ENTRADA
 * Não há nenhuma entrada neste problema.
 * 
 * SAÍDA
 * A saída contém um valor correspondente ao valor de S.
 * O valor deve ser impresso com dois dígitos após o ponto decimal.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

public class Ini_1156 {

	public static void main(String[] args) {
		float S = 1;
		int cont = 3;
		
		for(int i = 2; cont <= 39; i *= 2) {
			S += (float) cont / i;
			cont += 2;
		}
		
		System.out.printf("%.2f\n", S);
	}

}
