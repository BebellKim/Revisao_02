package Revisao_02;

import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int valor [] = new int[20], pares = 0;

		for (int i=0; i<20; i++) {
			System.out.println("Informe um número: ");
			valor[i]= ler.nextInt();
			
			if(valor[i]%2==0) {
				pares++;
			}
		}
			System.out.println("Os numeros pares são: " +pares);
			ler.close();
			

	}

}
