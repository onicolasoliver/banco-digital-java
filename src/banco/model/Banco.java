package banco.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) { this.nome = nome; }

    public void adicionarConta(Conta conta) { contas.add(conta); }

    public void listarContas() {
        System.out.println("=== Contas do Banco " + nome + " ===");
        for (Conta c : contas) {
            System.out.println("Ag: " + c.getAgencia()
                + " ^| Num: " + c.getNumero()
                + " ^| Titular: " + c.getCliente().getNome());
        }
    }

    public String getNome() { return nome; }
}
