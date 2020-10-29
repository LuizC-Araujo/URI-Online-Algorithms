package ini_1000_1100;

/* 1049 - ANIMAIS
 * 
 * PROBLEMA
 * Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, 
 * da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três 
 * palavras fornecidas.
 * 
 *                CARNIVORO--->AGUIA
 *            AVE<ONIVORO----->POMBA
 * VERTEBRADO<    	   ONIVORO------>HOMEM	
 *            MAMÍFERO<HERBIVORO---->VACA
 *                     
 *                     HEMATOFAGO--->PULGA
 *              INSETO<HERBIVORO---->LAGARTA
 * INVERTEBRADO<
 *              ANELIDEO<HEMATOFAGO->SANGUESSUGA
 *                       ONIVORO---->MINHOCA
 *                       
 * ENTRADA
 * A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura 
 * acima, com todas as letras minúsculas.
 * 
 * SAÍDA
 * Imprima o nome do animal correspondente à entrada fornecida.
 * 
 * 
 * 
 * Authot: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1049 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String estrutura = input.nextLine();
		String tipo = input.nextLine();
		String alimentacao = input.nextLine();
		
		input.close();
		
		if(estrutura.equals("vertebrado")) {
			if(tipo.equals("ave")) {
				if(alimentacao.equals("carnivoro")) System.out.println("aguia");
				else System.out.println("pomba");
			}else {
				if(alimentacao.equals("onivoro")) System.out.println("homem");
				else System.out.println("vaca");
			}
		}else {
			if(tipo.equals("inseto")) {
				if(alimentacao.equals("hematofago")) System.out.println("pulga");
				else System.out.println("lagarta");
			}else {
				if(alimentacao.equals("hematofago")) System.out.println("sanguessuga");
				else System.out.println("minhoca");
			}
		}

	}

}
