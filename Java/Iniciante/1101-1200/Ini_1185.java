package ini_1101_1200;

/* 1185 - ACIMA DA DIAGONAL SECUNDÁRIA
 * 
 * PROBLEMA
 * Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. 
 * Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima da 
 * diagonal secundária da matriz, conforme ilustrado abaixo (área verde).
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

public class Ini_1185 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		char operacao = input.next().charAt(0);
		float M[][] = new float[12][12], soma = 0;
		int linha, coluna;
		
		for(linha = 0; linha < 12; linha++) {
			for(coluna = 0; coluna < 12; coluna++) {
				M[linha][coluna] = input.nextFloat();
			}
		}
		
		int aux = 11, contNumeros = 0;
		for(linha = 0; linha < 11; linha++) {
			for(coluna = 0; coluna < aux; coluna++) {
				soma += M[linha][coluna];
				contNumeros++;
			}
			aux--;
		}
		
		if(operacao == 'S') System.out.printf("%.1f\n", soma);
		else System.out.printf("%.1f\n", soma / contNumeros);
		
		input.close();

	}

}
