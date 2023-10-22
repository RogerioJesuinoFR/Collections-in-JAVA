package ex1;

public class BancoTeste {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Joao da Silva", "123.456.789-10");
        Cliente cliente2 = new Cliente("Maria da Silva", "987.654.321-00");

        Banco banco = new Banco();

        banco.criarNovaConta(1, 1000.0, cliente1);
        banco.criarNovaConta(2, 2000.0, cliente2);

        banco.listarContas();

        int numeroContaDeposito = 1; // Número da conta em que deseja depositar
        double valorDeposito = 1110.48;

        for (ContaBancaria conta : banco.getContas()) {
            if (conta.getNumeroConta() == numeroContaDeposito) {
                conta.depositar(valorDeposito);
                System.out.println("Deposito de " + valorDeposito + " realizado na conta " + numeroContaDeposito);
                break;
            }
        }
        banco.listarContas();
    }
}
