package application;

import resources.Vendedor;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();

        vendedor.setNome("John");
        vendedor.setEndereco("Curitiba");
        vendedor.setTelefone("2133245432");
        vendedor.setCodigoSetor(555);
        vendedor.setSalarioBase(1000l);
        vendedor.setImposto(10l);
        vendedor.setValorVendas(1000l);
        vendedor.setComissao(10l);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Cidade: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Cód. Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
    }
}
