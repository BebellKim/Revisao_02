package Revisao_02;

import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int valor [] = new int[20], cem=0;

		for (int i=0; i<20; i++) {
			System.out.println("Informe um número: ");
			valor[i]= ler.nextInt();
			
			if(valor[i]<=100) {
				cem++;
			}
		}
			System.out.println("Os números iguais ou menores que cem são: " +cem);
			ler.close();
	}

}
