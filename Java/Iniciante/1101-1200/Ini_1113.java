package ini_1101_1200;
/*1113 CRESCENTE E DECRESCENTE
 * 
 * PROBLEMA
 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y 
 * uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
 * 
 * ENTRADA
 * A entrada contém vários casos de teste. Cada caso contém dois valores inteiros X e Y. A leitura 
 * deve ser encerrada ao ser fornecido valores iguais para X e Y.
 * 
 * SAÍDA
 * Para cada caso de teste imprima “Crescente”, caso os valores tenham sido digitados na ordem crescente, 
 * caso contrário imprima a mensagem “Decrescente”. 
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1113{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		do {
			x = input.nextInt();
			y = input.nextInt();
			
			if(x > y) 
				System.out.println("Decrescente");
			else if(y > x)
				System.out.println("Crescente");
			else
				break;
			
		}while(x != y);
		
		input.close();
	}

}
