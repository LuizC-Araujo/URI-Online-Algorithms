package ini_1101_1200;

/* 1188 - AREA INFERIOR
 * 
 * PROBLEMA
 * Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida,
 * calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área inferior da 
 * matriz, conforme ilustrado abaixo (área verde).
 * 
 * ENTRADA
 * A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação 
 * (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem 144 valores com ponto flutuante 
 * de dupla precisão que compõem a matriz.
 * 
 * SAÍDA
 * Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal. 
 * 
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1188 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		char operacao = input.next().charAt(0);
		
		double M[][] = new double [12][12], soma = 0;
		int linha, coluna, contNumeros = 0;
		
		for(linha = 0; linha < M.length; linha++) {
			for(coluna = 0; coluna < M[linha].length; coluna++) {
				M[linha][coluna] = input.nextDouble();
			}
		}
		
		for (linha = 0; linha < M.length; linha++) {
        	for (coluna = 0; coluna < M[linha].length; coluna++) {
        		if (coluna > M.length-linha-1 && coluna < linha) {
        			soma += M[linha][coluna];
        			contNumeros++;
        		}
        	}
        }
		if(operacao == 'S') System.out.printf("%.1f\n", soma);
		else System.out.printf("%.1f\n", soma / contNumeros);
		
		input.close();

	}

}
