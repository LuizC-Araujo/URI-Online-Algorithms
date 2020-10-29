package ini_1000_1100;

/* 1047 - TEMPO DE JOGO COM MINUTOS
 * 
 * PROBLEMA
 * Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do 
 * jogo.
 * Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
 * 
 * ENTRADA
 * Quatro números inteiros representando a hora de início e fim do jogo.
 * 
 * SAÍDA
 * Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1047 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int inicioHora = input.nextInt();
		int inicioMinuto = input.nextInt();
		int fimHora = input.nextInt();
		int fimMinuto = input.nextInt();
		int hora = 0;
		int minuto = 0;
		
		input.close();
		
		if(inicioHora == 24) inicioHora = 0;
		
		if(fimHora == 24 && fimMinuto < inicioMinuto) fimHora = 0;
		
		if(inicioMinuto == 60) {
			inicioMinuto = 0;
			inicioHora++;
		}
		
		if(fimMinuto == 60)	fimMinuto = 0;
		
		if(inicioHora < fimHora) hora = fimHora - inicioHora;
		else if(inicioHora > fimHora) hora = 24 - inicioHora + fimHora;
		else if(inicioHora == fimHora && fimMinuto <= inicioMinuto) hora = 24;
		
		if(inicioMinuto < fimMinuto) minuto = fimMinuto - inicioMinuto;
		else if(inicioMinuto > fimMinuto) minuto = 60 - inicioMinuto + fimMinuto;
		else minuto = 60;
		
		if(minuto > 60) {
			hora++;
			minuto -= 60;
		}else if(minuto == 60 ) minuto = 0;
		else if(minuto < 60 && fimMinuto < inicioMinuto) hora--;
		
		System.out.println("O JOGO DUROU " + hora + " HORA(S) E " + minuto + " MINUTO(S)");

	}

}
