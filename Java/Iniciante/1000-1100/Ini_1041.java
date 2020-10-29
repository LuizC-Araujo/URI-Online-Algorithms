package ini_1000_1100;

/* 1041 - COORDENADAS DE UM PONTO
 * 
 * PROBLEMA
 * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
 * A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos 
 * ou na origem (x = y = 0).
 *  Q2 | Q1
 * ____|____ 
 *     |
 *  Q3 | Q4 
 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
 * 
 * ENTRADA
 * A entrada contem as coordenadas de um ponto.
 * 
 * SAÍDA
 * A saída deve apresentar o quadrante em que o ponto se encontra.
 * 
 * 
 * 
 * Autor: Luiz Araujo
 * */
import java.util.Locale;
import java.util.Scanner;

public class Ini_1041 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float x = input.nextFloat();
		float y = input.nextFloat();
		
		input.close();
		
		if(x == 0 && y == 0) System.out.println("Origem");
		else if(x > 0 && y > 0) System.out.println("Q1");
		else if(x > 0 && y < 0) System.out.println("Q4");
		else if(x < 0 && y > 0) System.out.println("Q2");
		else if(x < 0 && y < 0) System.out.println("Q3");
		else if(x == 0) System.out.println("Eixo Y");
		else if(y == 0) System.out.println("Eixo X");

	}

}
