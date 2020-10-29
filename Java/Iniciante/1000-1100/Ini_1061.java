package ini_1000_1100;

/* 1061 - TEMPO DE UM EVENTO
 * 
 * PROBLEMA
 * Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e 
 * terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez 
 * que ele sabe quando inicia e quando termina o evento.
 * Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular 
 * a duração deste evento.
 * 
 * ENTRADA
 * Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual 
 * o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato 
 * hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas 
 * primeiras linhas, indicando o término do evento.
 * 
 * SAÍDA
 * Na saída, deve ser apresentada a duração do evento, no seguinte formato:
 * W dia(s)
 * X hora(s)
 * Y minuto(s)
 * Z segundo(s)
 * 
 * 
 * 
 * Author: Luiz Araujo
 * */

import java.util.Locale;
import java.util.Scanner;

public class Ini_1061 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String diaInicio = input.nextLine();
		String horarioInicio = input.nextLine();
		String diaFim = input.nextLine();
		String horarioFim = input.nextLine();
		
		input.close();;
		
		int dataInicio = 0;
		int dataFim = 0;
		int horaInicio = 0;
		int horaFim = 0;
		int minInicio = 0;
		int minFim = 0;
		int segInicio = 0;
		int segFim = 0;
		int segTotalInicio = 0, segTotalFim = 0, segTotal = 0, dia = 0, hora = 0, minuto = 0, segundo = 0;
		
		if(diaInicio.length() >= 5 && diaFim.length() >= 5) {
			diaInicio = diaInicio.replaceAll("\\s+$", ""); 
			
			if(diaInicio.substring(4).length() == 1) dataInicio = Integer.parseInt(diaInicio.substring(4));
			else dataInicio = Integer.parseInt(diaInicio.substring(4,6));
			
			diaFim = diaFim.replaceAll("\\s+$", "");
			
			if(diaFim.substring(4).length() == 1) dataFim = Integer.parseInt(diaFim.substring(4));
			else dataFim = Integer.parseInt(diaFim.substring(4,6));
		}
		
		int posicao = 0, cont = 0, pos1 = 0;
		int contador = horarioInicio.length();
		
		for(int i = 0;i<contador;i++){  
	          if (horarioInicio.substring(i,i+1).equals(":")){  
	             posicao = i;  
	             cont++;
	             if(cont == 1) pos1 = posicao;
	          }
	    }
		
		horaInicio = Integer.parseInt(horarioInicio.substring(0, pos1 - 1));
		minInicio = Integer.parseInt(horarioInicio.substring(pos1 + 2, posicao - 1));
		segInicio = Integer.parseInt(horarioInicio.substring(posicao + 2));
		
		posicao = 0;
		contador = horarioFim.length();
		
		for(int i = 0;i<contador;i++){  
	          if (horarioFim.substring(i,i+1).equals(":")){  
	             posicao = i;  
	             cont++;
	             if(cont == 1) pos1 = posicao;
	          }
	    }
		
		horaFim = Integer.parseInt(horarioFim.substring(0, pos1 - 1));
		minFim = Integer.parseInt(horarioFim.substring(pos1 + 2, posicao - 1));
		segFim = Integer.parseInt(horarioFim.substring(posicao + 2));
		
		//segTotalInicio = (horaInicio * 3600) + (minInicio * 60) + segInicio;
		//segTotalFim = (horaFim * 3600) + (minFim * 60) + segFim;
		
		//segTotal = Math.abs(segTotalInicio - segTotalFim);
		
		dia = dataFim - dataInicio;
		if(horaInicio < horaFim) {
			segTotalInicio = (horaInicio * 3600) + (minInicio * 60) + segInicio;
			segTotalFim = (horaFim * 3600) + (minFim * 60) + segFim;
			segTotal = Math.abs(segTotalInicio - segTotalFim);
			hora = segTotal / 3600;
			segTotal = segTotal % 3600;
			minuto = segTotal / 60;
			segundo = segTotal % 60;
			
		}else if(horaInicio >= horaFim){
			dia--;
			hora = 24 - horaInicio + horaFim;
			if(minInicio > minFim) {
				minuto = 60 - minInicio + minFim;
				hora--;
				if(segInicio > segFim) {
					segundo = 60 - segInicio + segFim;
					minuto--;
				}else segundo = segInicio - segFim;
				
			}else minuto = minFim - minInicio;
			
			if(hora == 24) {
				dia++;
				hora = 0;
			}
			if(segInicio > segFim) {
				segundo = 60 - segInicio + segFim;
				if(minInicio <= minFim) minuto--;
			}
			else segundo = Math.abs(segInicio - segFim);
		}
		
		System.out.println(dia + " dia(s)");
		System.out.println(hora + " hora(s)");
		System.out.println(minuto + " minuto(s)");
		System.out.println(segundo + " segundo(s)");

	}

}
