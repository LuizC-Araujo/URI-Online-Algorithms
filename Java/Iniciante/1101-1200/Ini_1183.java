package ini_1101_1200;

/* 1183 - ACIMA DA DIAGONAL PRINCIPAL
 * 
 * PROBLEMA
 * Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. 
 * Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima da 
 * diagonal principal da matriz, conforme ilustrado abaixo (área verde).
 * 
 * ENTRADA
 * A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação 
 * (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto 
 * flutuante que compõem a matriz.
 * 
 * SAÍDA
 * Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1183 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float M[][] = new float[12][12], soma = 0;
		int linha = 0, coluna = 0;
		char operacao = input.next().charAt(0);
		
		for(linha = 0; linha < 12; linha++) {
			for(coluna = 0; coluna < 12; coluna++) {
				M[linha][coluna] = input.nextFloat();
			}
		}
		int aux = 1, cont = 0;
		for(linha = 0; linha < 12; linha++) {
			for(coluna = aux; coluna < 12; coluna++) {
				soma += M[linha][coluna];
				cont++;
			}
			aux++;
		}
		
		if(operacao == 'S') System.out.printf("%.1f\n", soma);
		else System.out.printf("%.1f\n", soma / cont);
		
		input.close();

	}

}
