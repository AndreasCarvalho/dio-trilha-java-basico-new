import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 00;

        System.out.println("bem vindo ao Banco JK ");
        System.out.println("digite seu nome :");
        String nome = scanner.next();
        System.out.println("digite seu sobrenome :");
        String sobreNome = scanner.next();
        System.out.println("digite sua agencia :");
        String Agencia = scanner.next();
        System.out.println("conta :");
        int conta = scanner.nextInt();

        System.out.println("Sr."+ nome +" " + sobreNome + " bem vindo ao nosso banco");
        System.out.println("sua agencia é " + Agencia );
        System.out.println("sua conta é " + conta);
        System.out.println("seu saldo: "+ saldo + " ja esta disponivel para saque");

    }
}