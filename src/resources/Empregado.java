package resources;

public class Empregado extends Pessoa {
    private Integer codigoSetor;
    private Long salarioBase;
    private Long imposto;

    public Empregado() {

    }

    public Empregado(String nome, String endereco, String telefone, Integer codigoSetor, Long salarioBase, Long imposto) {
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public long calcularSalario() {
        return salarioBase - ((salarioBase * imposto) / 100);
    }

    public Integer getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(Integer codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public Long getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Long salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Long getImposto() {
        return imposto;
    }

    public void setImposto(Long imposto) {
        this.imposto = imposto;
    }
}
