package application;

import resources.Empregado;

public class TesteEmpregado {

    public static void main(String[] args) {
        Empregado emp = new Empregado();

        emp.setNome("John");
        emp.setEndereco("Curitiba");
        emp.setTelefone("4734385266");
        emp.setCodigoSetor(999);
        emp.setSalarioBase(1000l);
        emp.setImposto(10l);

        System.out.println("Nome: " + emp.getNome());
        System.out.println("Cidade: " + emp.getEndereco());
        System.out.println("Telefone: " + emp.getTelefone());
        System.out.println("Cód. Setor: " + emp.getCodigoSetor());
        System.out.println("Salário Líquido: " + emp.calcularSalario());
    }
}
