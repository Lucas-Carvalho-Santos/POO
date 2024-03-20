package classes;

public class agencia {
    private String codigo;
    private String nome_agc;
    private String endereco;
    private String nome_gerente;
    private Double movimentacao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome_agc() {
        return nome_agc;
    }

    public void setNome_agc(String nome_agc) {
        this.nome_agc = nome_agc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome_gerente() {
        return nome_gerente;
    }

    public void setNome_gerente(String nome_gerente) {
        this.nome_gerente = nome_gerente;
    }

    public Double getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(Double movimentacao) {
        this.movimentacao = movimentacao;
    }

    public void imprimir(){
        System.out.println("CÓDIGO AGÊNCIA: " + codigo);
        System.out.println("NOME AGÊNCIA: " + nome_agc);
        System.out.println("ENDEREÇO: " + endereco);
        System.out.println("NOME GERENTE: " + nome_gerente);
        System.out.println("MOVIMENTAÇÃO: " + movimentacao);
    }

}
