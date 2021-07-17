package fichas;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class cadastro {

    // Todas as variaveis.
    private static String nome;
    private static String sobrenome;
    private static String cpf;
    private static Date DataNasc;
    public static void main(String[] args) throws ParseException {
        Scanner ler = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("==== CADASTROS DE CANDIDATOS ====");
            
        // Criação da variavel Nome.
        do{   
            System.out.println("Digite o nome do candidato: ");
            nome = ler.nextLine();

            if(nome.length() == 0 ){
                System.out.println("O nome é obrigatório.");
            }
        }while(nome.length() <= 1 );

        // Criação da variavel Sobrenome.
        do{   
            System.out.println("Digite o sobrenome do candidato: ");
            sobrenome = ler.nextLine();

            if(sobrenome.length() == 0 ){
                System.out.println("O sobrenome é obrigatório.");
            }
        }while(sobrenome.length() <= 1); 
        
        // Criação da variavel CPF.
        do{   
            System.out.println("Digite o CPF do candidato: ");
            cpf = ler.nextLine();

            if(cpf.length() == 0 ){
                System.out.println("O CPF é obrigatório.");
            }

            if(cpf.length() > 11 ||cpf.length() < 11 ){
                System.out.println("O CPF contem apenas 11 digitos, insira um CPF valido.");
            }
        }while(cpf.length() > 11 ||cpf.length() < 11 );

        //Criação da variavel DataNasc.
        System.out.println("Digite sua data de nascimento, a data deve conter '/' para dividir os dias o mês e o ano.");
        DataNasc = sdf.parse(ler.next());
        
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + sdf.format(DataNasc));
    
        ler.close();
    }
}          