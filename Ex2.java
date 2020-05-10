package swith;

import java.util.Scanner;

/**
 *
 * @author Root
 */
public class Ex2 {

   
	public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        
        String cod;
        int quant;
        double cq =  3.20;
        double bs = 4.30;
        double bcovo = 5.50;
        double hb = 3.20;
        double chb = 4.30;
        double refri = 4.00;
        double soma;
        int resposta = 1;
        
        while(resposta == 1){
        System.out.println("Especificação  |Código|Preço");
        System.out.println("Cachorro quente|100   |3,20");
        System.out.println("Bauru simples  |101   |4,30");
        System.out.println("Bauru com ovo  |102   |5,50");
        System.out.println("Hambúrger      |103   |3,20");
        System.out.println("Cheeseburguer  |104   |4,30");
        System.out.println("Refrigerante   |105   |4,00\n\n");
        
        System.out.println("Digite código do seu pedido: ");
        cod = leitor.next();
        
        switch (cod){
            case "100":
                System.out.println("Quantidade: ");
                quant = leitor.nextInt();
                soma = quant * cq;
                System.out.printf("Valor á pagar: R$%.2f\n", soma);
                break;
            case "101":
                System.out.println("Quantidade: ");
                quant = leitor.nextInt();
                soma = quant * cq;
                System.out.printf("Valor á pagar: R$%.2f\n", soma);
                break;
            case "102":
                System.out.println("Quantidade: ");
                quant = leitor.nextInt();
                soma = quant * cq;
                System.out.printf("Valor á pagar: R$%.2f\n", soma);
                break;
            case "103":
                System.out.println("Quantidade: ");
                quant = leitor.nextInt();
                soma = quant * cq;
                System.out.printf("Valor á pagar: R$%.2f\n", soma);
                break;
            case "104":
                System.out.println("Quantidade: ");
                quant = leitor.nextInt();
                soma = quant * cq;
                System.out.printf("Valor á pagar: R$%.2f\n", soma);
                break;
            case "105":
                System.out.println("Quantidade: ");
                quant = leitor.nextInt();
                soma = quant * cq;
                System.out.printf("Valor á pagar: R$%.2f\n", soma);
                break;
            default:
                System.out.println("Código não pode ser reconhecido.");
                
               
        }
        
        System.out.println("Deseja compra mais [1] caso não [2]");
          resposta = leitor.nextInt();
          
          if(resposta !=1 ){
              
          }else{
              System.out.println("Volte sempre e obrigado pela preferência.");
                      
          }
        
        
        
      }
         
        
    }
    
}
