package ini_1101_1200;

/* 1117 - VALIDACAO DE NOTA
 * 
 * PROBLEMA
 * Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média 
 * semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo 
 * [0,10]). Cada nota deve ser validada separadamente.
 * 
 * ENTRADA
 * A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem 
 * lidas duas notas válidas.
 * 
 * SAÍDA
 * Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
 * Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo.
 * O valor deve ser apresentado com duas casas após o ponto decimal.
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
