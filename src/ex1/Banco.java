package ex1;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<ContaBancaria> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void criarNovaConta(int numeroConta, double saldoInicial, Cliente cliente) {
        ContaBancaria conta = new ContaBancaria(numeroConta, cliente);
        conta.depositar(saldoInicial);
        contas.add(conta);
        System.out.println("Conta criada com sucesso.");
    }

    public void listarContas() {
        for (ContaBancaria conta : contas) {
            System.out.println("Numero da conta: " + conta.getNumeroConta());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("Titular: " + conta.getNomeTitular()); // Usando o novo método
            System.out.println("CPF do titular: " + conta.getCPFTitular()); // Usando o novo método
            System.out.println("------------------------------");
        }
    }
    
    public List<ContaBancaria> getContas() {
        return contas;
    }
}
