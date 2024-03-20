package classes;

public class investimento {
    private String agencia;
    private String cliente;
    private int conta;
    private String gerente;
    private Double saldo;
    private Double investimento;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Double investimento) {
        this.investimento = investimento;
    }


    private void imprimir(){
        System.out.println("AGÊNCIA: " + agencia);
        System.out.println("CLIENTE: " + cliente);
        System.out.println("CONTA: " + conta);
        System.out.println("GERENTE: " + gerente);
        System.out.println("SALDO: R$ " + saldo);
        System.out.println("INVESTIMENTO: R$ " + investimento);
    }
}
