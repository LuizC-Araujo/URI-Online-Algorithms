package ini_1000_1100;

/* 1051 - IMPOSTO DE RENDA
 * 
 * PROBLEMA
 * Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois 
 * sabem que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em benef�cio da 
 * popula��o, sem qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.
 * Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida, 
 * calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
 * 
 *               RENDA              *    IMPOSTO
 *         0.00 a 2000.00           *    Isento
 *        2000.01 a 3000.00         *      8%
 *        3000.01 a 4500.00         *     18%
 *        acima de 4500.00          *     28%
 *        
 * Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, pois a faixa 
 * de sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. No exemplo fornecido (abaixo), 
 * a taxa � de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser 
 * impresso com duas casas decimais.
 * 
 * ENTRADA
 * A entrada cont�m apenas um valor de ponto flutuante, com duas casas decimais.
 * 
 * SA�DA
 * Imprima o texto "R$" seguido de um espa�o e do valor total devido de Imposto de Renda, com duas casas ap�s 
 * o ponto. Se o valor de entrada for menor ou igual a 2000, dever� ser impressa a mensagem "Isento".
 *               
 *               
 *               
 * Author: Luiz Araujo              
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1051 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double renda = input.nextDouble();
		
		input.close();
		
		int imposto[] = {8, 18, 28};
		double valorDevido = 0;
		int isento = 0;
		
		if(renda <= 2000.0) {
			System.out.println("Isento");
			isento = 1;
			renda -= 2000.0;
		}else if(renda > 4500.0) {
			renda -= 2000.0;
			valorDevido += 1500.0 * ((double) imposto[1] / 100);
			renda -= 1500.0;
			valorDevido += 1000.0 * ((double) imposto[0] / 100);
			renda -= 1000.0;
			valorDevido += renda * ((double) imposto[2] / 100);
		}else if(renda > 3000.0) {
			renda -= 2000.0;
			valorDevido += 1000.0 * ((double) imposto[0] / 100);
			renda -= 1000.0;
			valorDevido += renda * ((double) imposto[1] / 100);
		}else if(renda > 2000.00) {
			renda -= 2000.00;
			valorDevido += renda * ((double) imposto[0] / 100);
		}
			
		if(isento == 0)	System.out.printf("R$ %.2f\n", valorDevido);

	}

}
