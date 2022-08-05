import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta (Ex: 1021)");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Por favor, digite o código da agência (Ex: 067-8)");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o seu nome (Ex: MARIO ANDRADE)");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo (Ex: 237.48)");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma " +
                "conta em nosso banco! Sua agência é " + agencia + ", conta número " +
                numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

    }

}
