package ini_1101_1200;

/* 1114 - SENHA FIXA
 * 
 * PROBLEMA
 * Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha 
 * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve 
 * ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o 
 * valor 2002. 
 * 
 * ENTRADA
 * A entrada � composta por v�rios casos de testes contendo valores inteiros.
 * 
 * SA�DA
 * Para cada valor lido mostre a mensagem correspondente � descri��o do problema.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1114 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int senha;
		
		do {
			senha = input.nextInt();
			if(senha != 2002) System.out.println("Senha Invalida");
			else System.out.println("Acesso Permitido");			
		}while(senha != 2002);
		
		input.close();
	}

}
