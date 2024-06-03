public class ContaTerminal {

    int NumeroConta;
    String AgenciaCliente;
    String NomeCliente;
    float SaldoCliente;

    public ContaTerminal (int Numero, String Agencia, String Nome, float Saldo ) {

            this.NumeroConta = Numero;
            this.AgenciaCliente = Agencia;
            this.NomeCliente = Nome;
            this.SaldoCliente = Saldo;

    }

    public void imprimir() {
        System.out.println("Ola " + this.NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                this.AgenciaCliente + ", conta " + this.NumeroConta + " e seu saldo " + this.SaldoCliente +
                " e já está disponível para saque.");
    }


}
