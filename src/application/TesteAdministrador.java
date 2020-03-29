package application;

import resources.Administrador;

public class TesteAdministrador {

    public static void main(String[] args) {
        Administrador adm = new Administrador();

        adm.setNome("John");
        adm.setEndereco("Curitiba");
        adm.setTelefone("44988324456");
        adm.setCodigoSetor(888);
        adm.setSalarioBase(1000l);
        adm.setImposto(20l);
        adm.setAjudaDeCusto(300l);

        System.out.println("Nome: " + adm.getNome());
        System.out.println("Cidade: " + adm.getEndereco());
        System.out.println("Telefone: " + adm.getTelefone());
        System.out.println("Cód. Setor: " + adm.getCodigoSetor());
        System.out.println("Salário Líquido: " + adm.calcularSalario());
    }
}
