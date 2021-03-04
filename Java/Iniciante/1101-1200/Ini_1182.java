package ini_1101_1200;

/* 1182 - COLUNA NA MATRIZ
 * 
 * PROBLEMA
 * Neste problema você deve ler um número que indica uma coluna de uma matriz na qual uma operação deve ser 
 * realizada, um caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de uma 
 * matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área verde 
 * da matriz, conforme for o caso. A imagem abaixo ilustra o caso da entrada do valor 5 para a coluna da m
 * atriz, demonstrando os elementos que deverão ser considerados na operação.
 * 
 * ENTRADA
 * A primeira linha de entrada contem um número C (0 ≤ C ≤ 11) indicando a coluna que será considerada para 
 * operação. A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a operação 
 * (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante 
 * que compõem a matriz.
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

public class Ini_1182 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int column = input.nextInt();
		char operacao = input.next().charAt(0); 
		
		float M[][] = new float[12][12];
		
		for(int linha = 0; linha < 12; linha++) {
			for(int coluna = 0; coluna < 12; coluna++) {
				M[linha][coluna] = input.nextFloat();
			}
		}
		
		float soma = 0; 
		for(int linha = 0; linha < 12; linha++) {
			soma += M[linha][column];
		}
		
		if(operacao == 'S') System.out.printf("%.1f\n", soma);
		else System.out.printf("%.1f\n", soma / 12);
				
		input.close();
	}

}
