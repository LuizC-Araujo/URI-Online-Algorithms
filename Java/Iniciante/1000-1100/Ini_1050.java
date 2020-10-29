package ini_1000_1100;

/* 1050 - DDD
 * 
 * PROBLEMA
 * Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à 
 * qual cidade o DDD pertence, considerando a tabela abaixo:
 * 
 *   DDD  *    CIDADES    *
 *   61   *    Brasilia   *
 *   71   *    Salvador   *
 *   11   *    Sao Paulo  *
 *   21   * Rio de Janeiro*
 *   32   *  Juiz de Fora *
 *   19   *    Campinas   *
 *   27   *    Vitoria    *
 *   31   * Belo Horizonte*
 *   
 * Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
 * DDD nao cadastrado
 *
 * ENTRADA
 * A entrada consiste de um único valor inteiro.
 * 
 * SAÍDA
 * Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não 
 * existir DDD correspondente ao número digitado.
 *
 *
 *
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1050 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int ddd = input.nextInt();
		
		input.close();
		
		int ddds[] = {61, 71, 11, 21, 32, 19, 27, 31};
		String cidades[] = {"Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas",
				"Vitoria", "Belo Horizonte"};
		
		for(int i = 0; i < ddds.length; i++) {
			if(ddd == ddds[i]) {
				System.out.println(cidades[i]);
				break;
			}
			if(i == ddds.length - 1) System.out.println("DDD nao cadastrado");
		}

	}

}
