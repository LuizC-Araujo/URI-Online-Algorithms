package ini_1101_1200;


/* 1181 - LINHA NA MATRIZ
 * 
 * PROBLEMA
 * Neste problema você deve ler um número, indicando uma linha da matriz na qual uma operação deve ser realizada, 
 * um caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de uma matriz M[12][12]. 
 * Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área verde da matriz, conforme for 
 * o caso. A imagem abaixo ilustra o caso da entrada do valor 2 para a linha da matriz, demonstrando os 
 * elementos que deverão ser considerados na operação.
 * 
 * ENTRADA
 * A primeira linha de entrada contem um número L (0 ≤ L ≤ 11) indicando a linha que será considerada para 
 * operação. A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a 
 * operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de 
 * ponto flutuante que compõem a matriz, sendo que a mesma é preenchida linha por linha, da linha 0 até a 
 * linha 11, sempre da esquerda para a direita.
 * 
 * SAÍDA
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1181 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int line = input.nextInt();
		char operacao = input.next().charAt(0); 
		
		float M[][] = new float[12][12];
		
		for(int linha = 0; linha < 12; linha++) {
			for(int coluna = 0; coluna < 12; coluna++) {
				M[linha][coluna] = input.nextFloat();
			}
		}
		
		float soma = 0; 
		for(int coluna = 0; coluna < 12; coluna++) {
			soma += M[line][coluna];
		}
		
		if(operacao == 'S') System.out.printf("%.1f\n", soma);
		else System.out.printf("%.1f\n", soma / 12);
		
		input.close();

	}

}
