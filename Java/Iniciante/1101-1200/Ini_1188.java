package ini_1101_1200;

/* 1188 - AREA INFERIOR
 * 
 * PROBLEMA
 * Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada e uma matriz M[12][12]. Em seguida,
 * calcule e mostre a soma ou a m�dia considerando somente aqueles elementos que est�o na �rea inferior da 
 * matriz, conforme ilustrado abaixo (�rea verde).
 * 
 * ENTRADA
 * A primeira linha de entrada contem um �nico caractere Mai�sculo O ('S' ou 'M'), indicando a opera��o 
 * (Soma ou M�dia) que dever� ser realizada com os elementos da matriz. Seguem 144 valores com ponto flutuante 
 * de dupla precis�o que comp�em a matriz.
 * 
 * SA�DA
 * Imprima o resultado solicitado (a soma ou m�dia), com 1 casa ap�s o ponto decimal. 
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
