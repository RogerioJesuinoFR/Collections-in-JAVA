package ex1;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private Cliente titular;

    public ContaBancaria(int numeroConta, Cliente titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.00;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("O valor do deposito deve ser maior que zero.");
        }
    }

    public boolean sacar(double valor) {
        if (saldo >= valor && valor > 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    public String getNomeTitular() {
    	return titular.getNomeCliente();
    }
    
    public String getCPFTitular() {
    	return titular.getCPFCliente();
    }
}
