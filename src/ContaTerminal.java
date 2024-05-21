import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        String agencia = "067-9";
        String nomeCliente;
        double saldo = 586.56;

        System.out.println("Digite o seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        numero = scan.nextInt();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para o saque.");
    }
}