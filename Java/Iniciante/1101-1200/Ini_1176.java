package ini_1101_1200;

/* 1176 - FIBONACCI EM VETOR
 * 
 * PROBLEMA
 * Faça um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido. 
 * Lembre que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 
 * 2 anteriores a ele. Todos os valores de Fibonacci calculados neste problema devem caber em um inteiro 
 * de 64 bits sem sinal.
 * 
 * ENTRADA
 * A primeira linha da entrada contém um inteiro T, indicando o número de casos de teste. Cada caso de teste 
 * contém um único inteiro N (0 ≤ N ≤ 60), correspondente ao N-esimo termo da série de Fibonacci.
 * 
 * SAÍDA
 * Para cada caso de teste da entrada, imprima a mensagem "Fib(N) = X", onde X é o N-ésimo termo da série de 
 * Fibonacci.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1176 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		long Fib[] = new long[61];
		Fib[0] = 0;
		Fib[1] = 1;
		for(int i = 2; i < Fib.length; i++) {
			Fib[i] = Fib[i - 1] + Fib[i - 2];
		}
		
		int T = input.nextInt();
		int N;
	
		for(int i = 0; i < T; i++) {
			N = input.nextInt();
			System.out.println("Fib(" + N + ") = " + Fib[N]);
		}
		input.close();

	}

}
