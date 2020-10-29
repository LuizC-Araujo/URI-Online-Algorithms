package ini_1101_1200;

/* 1118 - VARIAS NOTAS COM VALIDACAO
 * 
 * PROBLEMA
 * Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. Calcule e imprima a 
 * média semestral. O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo 
 * [0,10]). Cada nota deve ser validada separadamente.
 * No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que informe um 
 * código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 
 * 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo 
 * cálculo, caso contrário o programa deve ser encerrado.
 * 
 * ENTRADA
 * O arquivo de entrada contém vários valores reais, positivos ou negativos. Quando forem lidas duas notas 
 * válidas, deve ser lido um valor inteiro X . O programa deve parar quando o valor lido para este X for 
 * igual a 2.
 * 
 * SAÍDA
 * Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. Quando duas notas válidas 
 * forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.
 * Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem deve 
 * ser apresentada novamente se o valor da entrada padrão para X for menor do que 1 ou maior do que 2, 
 * conforme o exemplo abaixo.
 * A média deve ser impressa com dois dígitos após o ponto decimal.
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
