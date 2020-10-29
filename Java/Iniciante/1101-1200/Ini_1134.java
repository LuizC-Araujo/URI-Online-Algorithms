package ini_1101_1200;

/* 1134 - TIPOS DE COMBUSTIVEL
 * 
 * PROBLEMA
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
 * Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 
 * 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser 
 * solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado 
 * for o número 4.
 * 
 * ENTRADA
 * A entrada contém apenas valores inteiros e positivos.
 * 
 * SAÍDA
 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de 
 * combustível, conforme exemplo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Scanner;

public class Ini_1134 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tipoCombustivel; 
		int contAlcool = 0, contGasolina = 0, contDiesel = 0;
		
		do {
			tipoCombustivel = input.nextInt();
			if(tipoCombustivel == 1) contAlcool++;
			else if(tipoCombustivel == 2) contGasolina++;
			else if(tipoCombustivel == 3) contDiesel++;
		}while(tipoCombustivel != 4);
		
		input.close();
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + contAlcool);
		System.out.println("Gasolina: " + contGasolina);
		System.out.println("Diesel: " + contDiesel);
	}

}
