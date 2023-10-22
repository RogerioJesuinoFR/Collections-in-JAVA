package ex1;

public class Cliente {

    private String nomeCliente;
    private String CPFCliente;

    public Cliente(String nomeCliente, String CPFCliente) {
        this.nomeCliente = nomeCliente;
        this.CPFCliente = CPFCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getCPFCliente() {
        return CPFCliente;
    }
}

