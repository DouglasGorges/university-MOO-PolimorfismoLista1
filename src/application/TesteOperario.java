package application;

import resources.Operario;

public class TesteOperario {
    public static void main(String[] args) {
        Operario oper = new Operario();

        oper.setNome("John");
        oper.setEndereco("Curitiba");
        oper.setTelefone("1133245567");
        oper.setCodigoSetor(777);
        oper.setSalarioBase(1000l);
        oper.setImposto(10l);
        oper.setValorProducao(100l);
        oper.setComissao(15l);

        System.out.println("Nome: " + oper.getNome());
        System.out.println("Cidade: " + oper.getEndereco());
        System.out.println("Telefone: " + oper.getTelefone());
        System.out.println("Cód. Setor: " + oper.getCodigoSetor());
        System.out.println("Salário Líquido: " + oper.calcularSalario());
    }
}
