package ini_1101_1200;

/* 1150 - ULTRAPASSANDO Z
 * 
 * PROBLEMA
 * Fa�a um programa que leia dois inteiros: X e Z (devem ser lidos tantos valores para Z quantos necess�rios, 
 * at� que seja digitado um valor maior do que X para ele). Conte quantos n�meros inteiros devem ser somados 
 * em sequ�ncia (considerando o X nesta soma) para que a soma ultrapasse a Z o m�nimo poss�vel. Escreva o 
 * valor final da contagem.
 * A entrada pode conter, por exemplo, os valores 21 21 15 30. Neste caso, � ent�o assumido o valor 21 para 
 * X enquanto os valores 21 e 15 devem ser desconsiderados pois s�o menores ou iguais a X. Como o valor 30 
 * est� dentro da especifica��o (maior do que X) ele ser� v�lido e ent�o deve-se processar os c�lculos para 
 * apresentar na sa�da o valor 2, pois � a quantidade de valores somados para se produzir um valor maior do 
 * que 30 (21 + 22).
 * 
 * ENTRADA
 * A entrada cont�m somente valores inteiros, um por linha, podendo ser positivos ou negativos. O primeiro 
 * valor da entrada ser� o valor de X. A pr�xima linha da entrada ir� conter Z. Se Z n�o atender a especifica��o 
 * do problema, ele dever� ser lido novamente, tantas vezes quantas forem necess�rias.
 * 
 * SA�DA
 * Imprima uma linha com um n�mero inteiro que representa a quantidade de n�meros inteiros que devem ser somadas, 
 * de acordo com a especifica��o acima.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1150 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int X = input.nextInt();
		int Z = input.nextInt();
		int cont = 1;
		
		while(Z <= X) Z = input.nextInt();
		if(X <= 0) cont = 0;
		for(int i = X; X <= Z; i++) {
			X += i;
			cont++;
		}
		
		System.out.println(cont);
		
		input.close();
	}

}
