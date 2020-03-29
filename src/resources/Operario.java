package resources;

public class Operario extends Empregado {
    private Long valorProducao;
    private Long comissao;

    public Operario() {
    }

    @Override
    public long calcularSalario() {
        return super.calcularSalario() + valorProducao + ((super.calcularSalario() * comissao) / 100);
    }

    public Long getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(Long valorProducao) {
        this.valorProducao = valorProducao;
    }

    public Long getComissao() {
        return comissao;
    }

    public void setComissao(Long comissao) {
        this.comissao = comissao;
    }
}
