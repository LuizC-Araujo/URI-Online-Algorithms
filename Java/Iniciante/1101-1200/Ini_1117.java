package ini_1101_1200;

/* 1117 - VALIDACAO DE NOTA
 * 
 * PROBLEMA
 * Fa�a um programa que leia as notas referentes �s duas avalia��es de um aluno. Calcule e imprima a m�dia 
 * semestral. Fa�a com que o algoritmo s� aceite notas v�lidas (uma nota v�lida deve pertencer ao intervalo 
 * [0,10]). Cada nota deve ser validada separadamente.
 * 
 * ENTRADA
 * A entrada cont�m v�rios valores reais, positivos ou negativos. O programa deve ser encerrado quando forem 
 * lidas duas notas v�lidas.
 * 
 * SA�DA
 * Se uma nota inv�lida  for lida, deve ser impressa a mensagem "nota invalida".
 * Quando duas notas v�lidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do c�lculo.
 * O valor deve ser apresentado com duas casas ap�s o ponto decimal.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1117 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float x, y;
		
		do {
			x = input.nextFloat();
			if(x < 0 || x > 10) System.out.println("nota invalida");
		}while(x < 0 || x > 10);
		
		do {
			y = input.nextFloat();
			if(y < 0 || y > 10) System.out.println("nota invalida");
		}while(y < 0 || y > 10);
		
		System.out.printf("media = %.2f\n", (x + y) / 2.0);
		
		input.close();

	}

}
