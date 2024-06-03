import java.util.Scanner;

public class ContaBanco {
        public static void main(String[] args) {

                Scanner Scan = new Scanner(System.in);

                System.out.println("Por favor, digite o nome do Cliente:");
                        String NomeCliente = Scan.nextLine();

                System.out.println("Por favor, digite a Agência:");
                        String Agencia = Scan.nextLine();

                System.out.println("Por favor, digite o número da Conta:");
                        int NumeroConta = Scan.nextInt();

                System.out.println("Por favor, digite o saldo da conta:");
                        float SaldoConta = Scan.nextFloat();

                ContaTerminal Conta01 = new ContaTerminal(NumeroConta, Agencia, NomeCliente, SaldoConta);

                        Conta01.imprimir();
        }
}