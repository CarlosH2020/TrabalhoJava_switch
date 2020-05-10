

package swith;

import java.util.Scanner;

public class Ex3 {

   
	public static void main(String[] args) {
        // TODO code application logic here
        
        //Classes criada 
        Inseriraluno inseriraluno = new Inseriraluno(); 
        InserirAgendamento  inserirAgendamento = new  InserirAgendamento();
        Alteraraluno alteraraluno = new Alteraraluno();
        BuscarAgendamento buscarAgendamento = new BuscarAgendamento();
        Excluialuno excluialuno = new Excluialuno();
        Consultaaluno consultaaluno = new Consultaaluno();
        
       
        
        Scanner leitor = new Scanner(System.in);
        int opc;
        //contador do/while
        do{
            
            //menu de opções
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Opção       Mensagens");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\n"
                + "1 - Executa a rotina de Inclusão de Alunos.\n"
                + "2 - Executa a rotina de Alteração de Alunos.\n"
                + "3 - Executa a rotina de Exclusão de Alunos.\n"
                + "4 - Executa a rotina de Consulta de Alunos.\n");
                opc = leitor.nextInt();
        
       switch (opc) {

            case 1: {
                inseriraluno.inseriraluno();
                break;
            }

            case 2: {
                alteraraluno.alteraraluno();
                
                break;
            }

            case 3: {
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("                 AGENDAMENTO");
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("\n"
                        + "1 - Novo agendamento.\n"
                        + "2 - Buscar agendamento.");
                int opcaoAgendamento = leitor.nextInt();
                switch (opcaoAgendamento) {
                    case 1:
                        inserirAgendamento.inserirAgendamento();
                        break;
                    case 2:
                        buscarAgendamento.buscarAgendamento();
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
               }
                
                
            }
            case 4: {
                System.out.print("TXt");
            }
            leitor.close();
        }

    } while (opc != 6);
}

    private static class Inseriraluno {

        public Inseriraluno() {
        }

        private void inseriraluno() {
            System.out.print("Nome do aluno:\n");
        }
    }

    private static class Alteraraluno {

        public Alteraraluno() {
        }

        private void alteraraluno() {
        Scanner leitor = new Scanner(System.in);
            
            String nome;
            System.out.print("Nome:");
            nome = leitor.next();
            
        }
    }

    private static class Excluialuno {

        public Excluialuno() {
        }
    }

    private static class Consultaaluno {

        public Consultaaluno() {
        }
    }

    private static class InserirAgendamento {

        public InserirAgendamento() {
        }

        private void inserirAgendamento() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class buscarAgendamento {

       

        
    }

    private static class BuscarAgendamento {

        public BuscarAgendamento() {
        }

        private void buscarAgendamento() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}