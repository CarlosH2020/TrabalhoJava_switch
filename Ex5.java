package swith;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		int opc;
		String cod;
		double calca = 50.00;
		double blusa = 20.00;
		double tenis = 100.00;
		double calc;
		double divi;
		double s_final;
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("cod             Produto                 Valor" );
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("001             Caslça                  R$50.00\n"
        		+"002             Blusa                   R$20.00\n"
        		+"003             Tenis                   R$100.00");
        cod = leitor.next();
        
        
       
        
        switch (cod) {
        case "001":{
        	
        	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Codigo       Mensagens");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1 - À vista em dinheiro ou cheque, com 10% de desconto\n"
            		+"2 - À vista com cartão de crédito, com 5% de desconto\n"
            		+"3 - Em 2 vezes, preço normal de etiqueta sem juros\n"
            		+"4 - Em 3 vezes, preço de etiqueta com acréscimo de 10%");
            opc = leitor.nextInt();
            switch (opc) {
            case 1:
            	calc = 10*calca/100;
            	
            	s_final = calca - calc;
            	
            	System.out.printf("Valor do desconto:%.2f",calc);
            	System.out.printf("Total:%.2f",s_final);
            	break;
            case 2:
            	calc = 5*calca/100;
            	
            	s_final = calca - calc;
            	
            	System.out.printf("Valor do desconto:%.2f\n",calc);
            	System.out.printf("Total:R$%.2f\n",s_final);
            	break;
            case 3:
            	divi = calca/2;
            	
            	System.out.printf("2 parcelas de %.2f\n",divi);
            	System.out.printf("Total:R$%.2f\n",calca);
            	
            	break;
            case 4:
            	calc = 10*calca/100;
            	s_final = calc + calca;
            	divi = s_final/3;
            	
            	System.out.printf("Valor do juros :%.2f\n",calc);
            	System.out.printf("3 parcelas de %.2f\n",divi);
            	System.out.printf("Total:R$%.2f\n",s_final);
            	
            	break;
			
			}
            break;
            }
        case "002":{
        	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Codigo       Mensagens");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1 - À vista em dinheiro ou cheque, com 10% de desconto\n"
            		+"2 - À vista com cartão de crédito, com 5% de desconto\n"
            		+"3 - Em 2 vezes, preço normal de etiqueta sem juros\n"
            		+"4 - Em 3 vezes, preço de etiqueta com acréscimo de 10%\n");
            opc = leitor.nextInt();
            switch (opc) {
            case 1:
            	calc = 10*blusa/100;
            	
            	s_final = blusa - calc;
            	
            	System.out.printf("Valor do desconto:%.2f",calc);
            	System.out.printf("Total:%.2f",s_final);
            	break;
            case 2:
            	calc = 5*blusa/100;
            	
            	s_final = blusa - calc;
            	
            	System.out.printf("Valor do desconto:%.2f\n",calc);
            	System.out.printf("Total:R$%.2f\n",s_final);
            	break;
            case 3:
            	divi = blusa/2;
            	
            	System.out.printf("2 parcelas de %.2f\n",divi);
            	System.out.printf("Total:R$%.2f\n",blusa);
            	
            	break;
            case 4:
            	calc = 10*blusa/100;
            	s_final = calc + blusaa;
            	divi = s_final/3;
            	
            	System.out.printf("Valor do juros :%.2f\n",calc);
            	System.out.printf("3 parcelas de %.2f\n",divi);
            	System.out.printf("Total:R$%.2f\n",s_final);
            	
            	break;
			
			}
            break;
        }
        case "003":{
        	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Codigo       Mensagens");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1 - À vista em dinheiro ou cheque, com 10% de desconto\n"
            		+"2 - À vista com cartão de crédito, com 5% de descontozn"
            		+"3 - Em 2 vezes, preço normal de etiqueta sem juros\n"
            		+"4 - Em 3 vezes, preço de etiqueta com acréscimo de 10%\n");
            opc = leitor.nextInt();
            switch (opc) {
            case 1:
            	calc = 10*tenis/100;
            	
            	s_final = calca - calc;
            	
            	System.out.printf("Valor do desconto:%.2f",calc);
            	System.out.printf("Total:%.2f",s_final);
            	break;
            case 2:
            	calc = 5*tenis/100;
            	
            	s_final = tenis - calc;
            	
            	System.out.printf("Valor do desconto:%.2f\n",calc);
            	System.out.printf("Total:R$%.2f\n",s_final);
            	break;
            case 3:
            	divi = tenis/2;
            	
            	System.out.printf("2 parcelas de %.2f\n",divi);
            	System.out.printf("Total:R$%.2f\n",tenis);
            	
            	break;
            case 4:
            	calc = 10*tenis/100;
            	s_final = calc + tenis;
            	divi = s_final/3;
            	
            	System.out.printf("Valor do juros :%.2f\n",calc);
            	System.out.printf("3 parcelas de %.2f\n",divi);
            	System.out.printf("Total:R$%.2f\n",s_final);
            	
            	break;
			
			}
            break;
        }
            
            
		
		}
        

	}

}
