package ini_1101_1200;

/* 1149 - SOMANDO INTEIROS CONSECUTIVOS
 * 
 * PROBLEMA 
 * Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma de A para cada i com os valores 
 * (0 <= i <= N-1). Enquanto N for negativo ou ZERO, um novo N(apenas N) deve ser lido.
 * 
 * ENTRADA
 * A entrada contém somente valores inteiros, podendo ser positivos ou negativos. Todos os valores estão 
 * na mesma linha.
 * 
 * SAÍDA
 * A saída contém apenas um valor inteiro.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1149 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        int A = input.nextInt();
        int N = input.nextInt();
        
        while(N < 1) N = input.nextInt();
        
        int soma = 0;
        
        for(int i = 0; i <= N - 1; i++)
        	soma += i + A;
        
        System.out.println(soma);
        
        input.close();
	}
		
}
