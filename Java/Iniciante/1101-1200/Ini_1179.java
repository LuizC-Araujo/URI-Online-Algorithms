package ini_1101_1200;

/* 1179 - PREENCHIMENTO DE VETOR IV
 * 
 * PROBLEMA
 * Neste problema voc� dever� ler 15 valores coloc�-los em 2 vetores conforme estes valores forem pares ou 
 * �mpares. S� que o tamanho de cada um dos dois vetores � de 5 posi��es. Ent�o, cada vez que um dos dois 
 * vetores encher, voc� dever� imprimir todo o vetor e utiliz�-lo novamente para os pr�ximos n�meros que 
 * forem lidos. Terminada a leitura, deve-se imprimir o conte�do que restou em cada um dos dois vetores, 
 * imprimindo primeiro os valores do vetor impar. Cada vetor pode ser preenchido tantas vezes quantas for 
 * necess�rio.
 * 
 * ENTRADA
 * A entrada cont�m 15 n�meros inteiros.
 * 
 * SA�DA
 * Imprima a sa�da conforme o exemplo abaixo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1179 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x, i = 0;
		int par[] = new int[5], contPar = 0;
		int impar[] = new int[5], contImpar = 0;
		
		do {
			x = input.nextInt();
			if(x % 2 == 0) {
				par[contPar] = x;
				contPar++;
				if(contPar == 5) {
					contPar = 0;
					for(int j = 0; j < 5; j++) {
						System.out.println("par[" + j + "] = " + par[j]);
						par[j] = 1;
					}
				}
			}else {
				impar[contImpar] = x;
				contImpar++;
				if(contImpar == 5) {
					contImpar = 0;
					for(int j = 0; j < 5; j++) {
						System.out.println("impar[" + j + "] = " + impar[j]);
						impar[j] = 0;
					}
				}
			}
			i++;
		}while(i < 15);
		
		input.close();
		
		for(i = 0; i < impar.length; i++) {
			if(impar[i] % 2 != 0)
				System.out.println("impar[" + i + "] = " + impar[i]);
		}
		
		for(i = 0; i < par.length; i++) {
			if(par[i] % 2 == 0)
				System.out.println("par[" + i + "] = " + par[i]);
		}
			
		
		

	}

}
