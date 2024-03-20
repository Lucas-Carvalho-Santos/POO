package classes;

public class cliente {
    private String nome;
    private int idade;
    private String sexo;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private String cidade;

    public void imprimir(){
        System.out.println("NOME: " + nome);
        System.out.println("IDADE: " + idade);
        System.out.println("SEXO: " + sexo);
        System.out.println("EDEREÇO: " + endereco);
        System.out.println("CIDADE: " + cidade);
    }

}
