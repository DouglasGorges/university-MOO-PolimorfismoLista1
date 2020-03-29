package resources;

public class Vendedor extends Empregado {
    private Long valorVendas;
    private Long comissao;

    public Vendedor() {
    }

    @Override
    public long calcularSalario() {
        return super.calcularSalario() + valorVendas + ((super.calcularSalario() * comissao) / 100);
    }

    public Long getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(Long valorVendas) {
        this.valorVendas = valorVendas;
    }

    public Long getComissao() {
        return comissao;
    }

    public void setComissao(Long comissao) {
        this.comissao = comissao;
    }
}
