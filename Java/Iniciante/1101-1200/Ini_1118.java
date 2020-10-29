package ini_1101_1200;

/* 1118 - VARIAS NOTAS COM VALIDACAO
 * 
 * PROBLEMA
 * Escreva um programa para ler as notas da primeira e a segunda avalia��o de um aluno. Calcule e imprima a 
 * m�dia semestral. O programa s� dever� aceitar notas v�lidas (uma nota v�lida deve pertencer ao intervalo 
 * [0,10]). Cada nota deve ser validada separadamente.
 * No final deve ser impressa a mensagem �novo calculo (1-sim 2-nao)�, solicitando ao usu�rio que informe um 
 * c�digo (1 ou 2) indicando se ele deseja ou n�o executar o algoritmo novamente, (aceitar apenas os c�digo 
 * 1 ou 2). Se for informado o c�digo 1 deve ser repetida a execu��o de todo o programa para permitir um novo 
 * c�lculo, caso contr�rio o programa deve ser encerrado.
 * 
 * ENTRADA
 * O arquivo de entrada cont�m v�rios valores reais, positivos ou negativos. Quando forem lidas duas notas 
 * v�lidas, deve ser lido um valor inteiro X . O programa deve parar quando o valor lido para este X for 
 * igual a 2.
 * 
 * SA�DA
 * Se uma nota inv�lida for lida, deve ser impressa a mensagem �nota invalida�. Quando duas notas v�lidas 
 * forem lidas, deve ser impressa a mensagem �media = � seguido do valor do c�lculo.
 * Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem deve 
 * ser apresentada novamente se o valor da entrada padr�o para X for menor do que 1 ou maior do que 2, 
 * conforme o exemplo abaixo.
 * A m�dia deve ser impressa com dois d�gitos ap�s o ponto decimal.
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1118 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float x, y;
		int continuar;
		
		do {
			do {
				x = input.nextFloat();
				if(x < 0 || x > 10) System.out.println("nota invalida");
			}while(x < 0 || x > 10);
			
			do {
				y = input.nextFloat();
				if(y < 0 || y > 10) System.out.println("nota invalida");
			}while(y < 0 || y > 10);
			
			System.out.printf("media = %.2f\n", (x + y) / 2.0);
			
			do {
				System.out.println("novo calculo (1-sim 2-nao)");
				continuar = input.nextInt();
			}while(continuar < 1 || continuar > 2);
			
		}while(continuar == 1);
		
		
		
		input.close();

	}

}
