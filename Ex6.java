package swith;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  leitor = new Scanner(System.in);
		String cod;
		double s_porc,s_calc;
		double dir = 20000.00;
		double eng = 12000.00;
		double tec = 2000.00;
		double ger = 5900.00;
		double an = 2800.00;
		double cd= 3600.00;
		double adm = 3400.00;
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Cargo                Código   Salário Atual      " );
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Diretor               001     R$20.000,00\n"
        		+"Engenheiro            002     R$12.000,00\n"
        		+"Técnico               003     R$2.000,00\n"
        		+"Gerente               004     R$5.900,00\n"
        		+"Analista              005     R$2.800,00\n"
        		+"Coordenador           006     R$3.600,00\n");
        
        cod = leitor.next();
        switch (cod) {
        case "001":
        	s_porc = 10*dir/100;
        	s_calc = dir+s_porc;
        	
        	System.out.printf("Salário antigo:%.2f\n",dir);
        	System.out.printf("Sue salário teve um almento de 10 porcento encima de:%.2f\n",dir);
        	System.out.printf("Salário atual:R$%.2f\n",s_calc);
        	break;
        case "002":
        	s_porc = 20*eng/100;
        	s_calc = eng+s_porc;
        	
        	System.out.printf("Salário antigo:%.2f\n",eng);
        	System.out.printf("Sue salário teve um almento de 20 porcento encima de:%.2f\n",eng);
        	System.out.printf("Salário atual:R$%.2f\n",s_calc);
        	break;
        case "003":
        	s_porc = 30*tec/100;
        	s_calc = tec+s_porc;
        	
        	System.out.printf("Salário antigo:%.2f\n",tec);
        	System.out.printf("Sue salário teve um almento de 30 porcento encima de:%.2f\n",tec);
        	System.out.printf("Salário atual:R$%.2f\n",s_calc);
        	break;
        case "004":
        	s_porc = 10*ger/100;
        	s_calc = ger+s_porc;
        	
        	System.out.printf("Salário antigo:%.2f\n",ger);
        	System.out.printf("Sue salário teve um almento de 10 porcento encima de:%.2f\n",ger);
        	System.out.printf("Salário atual:R$%.2f\n",s_calc);
        	break;
        case "005":
        	s_porc = 30*an/100;
        	s_calc = an+s_porc;
        	
        	System.out.printf("Salário antigo:%.2f\n",an);
        	System.out.printf("Sue salário teve um almento de 30 porcento encima de:%.2f\n",an);
        	System.out.printf("Salário atual:R$%.2f\n",s_calc);
        	break;
        case "006":
        	s_porc = 20*cd/100;
        	s_calc = cd+s_porc;
        	
        	System.out.printf("Salário antigo:%.2f\n",cd);
        	System.out.printf("Sue salário teve um almento de 20 porcento encima de:%.2f\n",cd);
        	System.out.printf("Salário atual:R$%.2f\n",s_calc);
        	break;
        default:
        	s_porc = 40*adm/100;
        	s_calc = s_porc+adm;
        	System.out.println("Cargo: Adiministrador");
        	System.out.printf("Sálario antigo:R$%.2f\n",adm);
        	System.out.printf("Diferença:R$%.2f\n",s_porc);
        	System.out.printf("Sálario novo:R$%.2f\n",s_calc);
        	
        	
        
        
		}
       
        
        
		
		
		

	}

}
