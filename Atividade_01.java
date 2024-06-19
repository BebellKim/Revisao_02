package Revisao_02;

import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int valor [] = new int[20], maiores8 = 0;

		for (int i=0; i<8; i++) {
			System.out.println("Informe a idade: ");
			valor[i]= ler.nextInt();
			
			if(valor[i]>8) {
				maiores8++;
			}
		}
			System.out.println("As pessoas com mais de 8 anos são: " +maiores8);
			ler.close();
			

	}

}
