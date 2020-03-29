package resources;

public class Fornecedor extends Pessoa {
    private Long valorCredito;
    private Long valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, Long valorCredito, Long valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public Fornecedor() {

    }

    public Long valorSaldo() {
        return valorCredito - valorDivida;
    }

    public Long getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Long valorCredito) {
        this.valorCredito = valorCredito;
    }

    public Long getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(Long valorDivida) {
        this.valorDivida = valorDivida;
    }
}
