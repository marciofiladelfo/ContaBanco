import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta : ");
        int conta = sc.nextInt();

        System.out.print("Por favor, digite o número da Agência : ");
        String agencia = sc.next();

        System.out.print("Por favor, digite o nome do cliente : ");
        String nome = sc.next();

        System.out.print("Por favor, digite o saldo : ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ",conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
