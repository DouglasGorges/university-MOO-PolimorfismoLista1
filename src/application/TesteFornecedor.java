package application;

import resources.Fornecedor;
import sun.lwawt.macosx.CSystemTray;

public class TesteFornecedor {

    public static void main(String[] args){
        Fornecedor forn = new Fornecedor();

        forn.setNome("John");
        forn.setEndereco("Curitiba");
        forn.setTelefone("41996165177");
        forn.setValorCredito(1000l);
        forn.setValorDivida(200l);

        System.out.println("Nome: " + forn.getNome());
        System.out.println("Cidade: " + forn.getEndereco());
        System.out.println("Telefone: " + forn.getTelefone());
        System.out.println("Saldo: " + forn.valorSaldo());
    }
}
