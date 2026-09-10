package banco;

import banco.model.*;

public class Main {
    public static void main(String[] args) {
        Cliente camila = new Cliente("Camila", "123.456.789-00");
        Cliente venilton = new Cliente("Venilton", "987.654.321-00");

        Conta cc = new ContaCorrente(camila);
        Conta cp = new ContaPoupanca(venilton);

        cc.depositar(1000);
        cc.transferir(300, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Banco banco = new Banco("Digital Bank");
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.listarContas();
    }
}
