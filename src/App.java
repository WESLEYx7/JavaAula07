import java.util.Scanner;
import processamento.ProcNota;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.slq.SQLClientInfoException;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        /*Gigite seu nome
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        //Digite sua idade
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        //Digite seu peso
        System.out.println("Digite seu peso: ");
        Double peso = sc.nextDouble();
        */


        //System.out.println("Seu nome e " + nome + ", voce tem " + idade + "  anos e voce pesa " + peso + "kg");

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.nextLine();
        ProcNota pn = new ProcNota(nome);
        System.out.println("O nome do cliente e " + nome);

        ProcNota pb = new ProcNota(nome);
        pn.baixarNota();
        System.out.println("Data da baixa: " + pn.getDataDaBaixa());

        /* Serve para conectar ao banco de dados 
        try {
            String driver = "com.mysql.jdbc.Driver";
        } catch(Exception a) {

        }
        */

    }

}
