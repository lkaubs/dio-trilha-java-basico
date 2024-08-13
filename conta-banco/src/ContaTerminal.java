
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroAgencia;
        String agencia, nomeCliente;
        float saldo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        numeroAgencia = entrada.nextInt();

        System.out.println("Por favor, digite a Agência !");
        agencia = entrada.next();
        entrada.nextLine();

        System.out.println("Por favor, digite o nome do cliente !");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o saldo !");
        saldo = entrada.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroAgencia+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
