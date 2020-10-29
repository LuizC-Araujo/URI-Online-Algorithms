package ini_1101_1200;

/* 1131 - GRENAIS
 * 
 * PROBLEMA
 * A Federa��o Ga�cha de Futebol contratou voc� para escrever um programa para fazer uma estat�stica do 
 * resultado de v�rios GRENAIS. Escreva um programa para ler o n�mero de gols marcados pelo Inter e pelo 
 * Gr�mio em um GRENAL. Logo ap�s escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma resposta. 
 * Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o n�mero de gols marcados pelos 
 * times em uma nova partida, caso contr�rio deve ser encerrado imprimindo:
 * - Quantos GRENAIS fizeram parte da estat�stica.
 * - O n�mero de vit�rias do Inter.
 * - O n�mero de vit�rias do Gr�mio.
 * - O n�mero de Empates.
 * - Uma mensagem indicando qual o time que venceu o maior n�mero de GRENAIS (ou "Nao houve vencedor", caso 
 * termine empatado).
 * 
 * ENTRADA
 * O arquivo de entrada cont�m 2 valores inteiros, correspondentes aos gols marcados pelo Inter e pelo Gr�mio 
 * respectivamente. Em seguida h�ver� um inteiro (1 ou 2), correspondente � repeti��o do programa.
 * 
 * SA�DA
 * Ap�s cada leitura dos gols, deve ser impressa a mensagem "Novo grenal (1-sim 2-nao)". Quando o algoritmo 
 * for encerrado devem ser mostradas as estat�sticas conforme a descri��o apresentada acima. Obs: a palavra 
 * "Gremio" deve ser impressa sem acento, conforme o exemplo abaixo.
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1131 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int gremio, inter;
		int contGrenais = 0, contInter = 0, contGremio = 0, contEmpates = 0;
		int continuar;
		
		do {
			inter = input.nextInt();
			gremio = input.nextInt();
			contGrenais++;
			if(inter > gremio) contInter++;
			else if(gremio > inter) contGremio++;
			else contEmpates++;
			
			do {
				System.out.println("Novo grenal (1-sim 2-nao)");
				continuar = input.nextInt();
			}while(continuar < 1 || continuar > 2);
			
		}while(continuar == 1);
		
		
		System.out.println(contGrenais + " grenais");
		System.out.println("Inter:" + contInter);
		System.out.println("Gremio:" + contGremio);
		System.out.println("Empates:" + contEmpates);
		
		if(contInter > contGremio)
			System.out.println("Inter venceu mais");
		else if(contGremio > contInter)
			System.out.println("Gremio venceu mais");
		else
			System.out.println("Nao houve vencedor");
		
		input.close();

	}

}
