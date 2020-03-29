package resources;

public class Pessoa {
    private String Nome;
    private String Endereco;
    private String Telefone;

    public Pessoa(String nome, String endereco, String telefone) {
        Nome = nome;
        Endereco = endereco;
        Telefone = telefone;
    }

    public Pessoa(String nome) {
        Nome = nome;
    }

    public Pessoa() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
}
