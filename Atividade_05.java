package Revisao_02;

import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int valor [] = new int[8], negativo = 0;
		int soma=0;

		for (int i=0; i<8; i++) {
			System.out.println("Informe um número: ");
			valor[i]= ler.nextInt();
			
			soma=soma+valor[i];
			
			if(valor[i]<0) {
				negativo++;
			}
		}
			System.out.println("Os números iguais ou menores que cem são: " +soma);
			ler.close();

	}

}
