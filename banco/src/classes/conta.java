package classes;

public class conta {
    private int numero;
    private Double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void imprimir(){
        System.out.println("NÚMERO CONTA: " + numero);
        System.out.println("SALDO: R$ " + saldo);
    }
}

