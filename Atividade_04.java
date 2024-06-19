package Revisao_02;

import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int valor [] = new int[20], cem=0, maiscem=0, duzentos=0;

		for (int i=0; i<20; i++) {
			System.out.println("Informe um número: ");
			valor[i]= ler.nextInt();
			
			if(valor[i]<=100) {
				cem++;
				
			}
				
				if(valor[i]>=101) {
					maiscem++;
			}
				
				if(valor[i]>200) {
					duzentos++;
			}
		}
			System.out.println("Os números iguais ou menores que cem são: " +cem);
			
			System.out.println("Os números maiores que cem são: " +maiscem);
			
			System.out.println("Os números maiores que duzentos são: " +duzentos);
			ler.close();

	}

}
