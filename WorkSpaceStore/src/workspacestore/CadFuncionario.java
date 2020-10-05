package workspacestore;

import java.util.Scanner;

public class CadFuncionario {
    private static String nome;
    private static String email;
    private static int telefone;
    private static String cpf;
    private static int idade;
    private static String pis;
    private static String funcao;
    
    public static void main(String[] args){
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o nome do funcionário: ");
        nome = leia.nextLine();
        
        System.out.println("Digite o e-mail do funcionário: ");
        email = leia.nextLine();
        
        System.out.println("Digite o telefone do funcionário: ");
        telefone = leia.nextInt();
        
        System.out.println("Digite o CPF do funcionário: ");
        cpf = leia.nextLine();
        
        System.out.println("Digite a idade do funcionário: ");
        idade = leia.nextInt();
        
        System.out.println("Digite a PIS/PASEP do funcionário: ");
        pis = leia.nextLine();
        
        System.out.println("Digite a função do funcionário: ");
        funcao = leia.nextLine();
        
        
        
        System.out.println("NOME: "+nome);
        System.out.println("E-MAIL: "+email);
        System.out.println("TELEFONE: "+telefone);
        System.out.println("CPF: "+cpf);
        System.out.println("IDADE: "+idade);     
        System.out.println("PIS/PASEP: "+pis);
        System.out.println("FUNÇÃO: "+funcao);
    }
            
    
}
