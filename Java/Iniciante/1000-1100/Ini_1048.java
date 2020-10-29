package ini_1000_1100;

/* 1048 - AUMENTO DE SAL�RIO
 * 
 * PROBLEMA
 * A empresa ABC resolveu conceder um aumento de sal�rios a seus funcion�rios de acordo com a tabela abaixo:
 * 
 *     SAL�RIO    *    PERCENTUAL    *
 *    0-400.00    *		  15%        *
 *  400.01-800.00 *		  12%        *
 * 800.01-1200.00 *		  10%        *
 * 1200.01-2000.00*		   7%        *
 * Acima de 2000  *		   4%        *
 * 
 * Leia o sal�rio do funcion�rio e calcule e mostre o novo sal�rio, bem como o valor de reajuste ganho e o 
 * �ndice reajustado, em percentual.
 * 
 * ENTRADA
 * A entrada cont�m apenas um valor de ponto flutuante, com duas casas decimais.
 * 
 * SA�DA
 * Imprima 3 linhas na sa�da: o novo sal�rio, o valor ganho de reajuste e o percentual de reajuste ganho, 
 * conforme exemplo abaixo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1048 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double salarioAtual = input.nextDouble();
		
		input.close();
		
		double salarioNovo = 0;
		double reajuste = 0;
		int aux = 0;
		int aumento[] = {15, 12, 10, 7, 4};
		
		if(salarioAtual >= 0 && salarioAtual <= 400.0) {
			salarioNovo = salarioAtual * ((double)aumento[0] / 100 + 1);
			reajuste = salarioAtual * ((double)aumento[0] / 100);
			aux = aumento[0];
		}else if(salarioAtual > 400.0 && salarioAtual <= 800.0) {
			salarioNovo = salarioAtual * ((double)aumento[1] / 100 + 1);
			reajuste = salarioAtual * ((double)aumento[1] / 100);
			aux = aumento[1];
		}else if(salarioAtual > 800.0 && salarioAtual <= 1200.00) {
			salarioNovo = salarioAtual * ((double)aumento[2] / 100 + 1);
			reajuste = salarioAtual * ((double)aumento[2] / 100);
			aux = aumento[2];
		}else if(salarioAtual > 1200.0 && salarioAtual <= 2000.00) {
			salarioNovo = salarioAtual * ((double)aumento[3] / 100 + 1);
			reajuste = salarioAtual * ((double)aumento[3] / 100);
			aux = aumento[3];
		}else {
			salarioNovo = salarioAtual * ((double)aumento[4] / 100 + 1);
			reajuste = salarioAtual * ((double)aumento[4] / 100);
			aux = aumento[4];
		}
			
		System.out.printf("Novo salario: %.2f\n", salarioNovo);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.println("Em percentual: " + aux + " %");

	}

}
