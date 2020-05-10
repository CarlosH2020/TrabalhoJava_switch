package swith;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		int opc;
		double media;
		double b1, b2, b3;
		int peso1 = 3;
		int peso2 = 3;
		int peso3 = 4;
		
		System.out.println("Opção 1: média aritmética.\n"
				+ "Opção 2: ponderada (pesos 3,3,4).");
		opc = leitor.nextInt();
		
		switch (opc){
		case 1 :
			System.out.println("Informe suas notas");
			
			System.out.println("B1:");
			b1 = leitor.nextInt();
			System.out.println("B2:");
			b2 = leitor.nextInt();
			System.out.println("B3:");
			b3 = leitor.nextInt();
			
			
			media = (b1+b2+b3 /3);
			System.out.printf("Sua nota final é:%.2f\n", media);
			break;
			
		case 2 :
			System.out.println("Informe suas notas");
			
			System.out.println("B1:");
			b1 = leitor.nextInt();
			System.out.println("B2:");
			b2 = leitor.nextInt();
			System.out.println("B3:");
			b3 = leitor.nextInt();
			
			
			media = ((b1*peso1)+(b2*peso2)+(b3*peso3))/(peso1+peso2+peso3);
			System.out.printf("Sua nota final:%.2f\n",media);
			break;
			
			
			
		}
		
		
		
		

	}

}
