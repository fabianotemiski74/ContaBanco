import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita os dados da conta ao usuário
            System.out.print("Digite o número da agência: ");
            String agencia = scanner.nextLine();

            System.out.print("Digite o número da conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir o \n restante

            System.out.print("Digite o nome do cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("O saldo inicial: ");
            double saldo = scanner.nextDouble();

            // Exibe a mensagem de boas-vindas
            System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
}