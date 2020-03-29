package resources;

public class Administrador extends Empregado {
    private Long ajudaDeCusto;

    public Administrador() {
    }

    public Administrador(Long ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public long calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }

    public Long getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(Long ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }
}
