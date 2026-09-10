# 🏦 Banco Digital em Java

Projeto prático de um **Banco Digital** desenvolvido em **Java**, com foco nos pilares da **Programação Orientada a Objetos (POO)**: Abstração, Encapsulamento, Herança e Polimorfismo.

## 📋 Descrição

O sistema simula operações bancárias básicas, como:

- Criação de contas (Corrente e Poupança)
- Depósito
- Saque
- Transferência entre contas
- Impressão de extrato
- Listagem de contas do banco

## 🧠 Conceitos de POO aplicados

| Pilar | Onde aparece |
|-------|--------------|
| **Abstração** | Classe abstrata `Conta`, que define o essencial de uma conta bancária |
| **Encapsulamento** | Atributos `private`/`protected` com getters e setters |
| **Herança** | `ContaCorrente` e `ContaPoupanca` estendem `Conta` |
| **Polimorfismo** | Método `imprimirExtrato()` sobrescrito em cada subclasse |

## 🗂️ Estrutura do projeto

~~~text
banco-digital/
└── src/
    └── banco/
        ├── Main.java
        └── model/
            ├── Banco.java
            ├── Cliente.java
            ├── Conta.java
            ├── ContaCorrente.java
            └── ContaPoupanca.java
~~~

## 🚀 Como executar

1. Clone o repositório:
   ~~~bash
   git clone https://github.com/onicolasoliver/banco-digital-java.git
   ~~~
2. Abra o projeto em uma IDE (IntelliJ, Eclipse ou VS Code).
3. Execute a classe `Main.java`.

## 🖨️ Exemplo de saída

~~~text
=== Extrato Conta Corrente ===
Titular: Camila
Agencia: 1
Numero: 1
Saldo: 700,00
=== Extrato Conta Poupanca ===
Titular: Venilton
Agencia: 1
Numero: 2
Saldo: 300,00
=== Contas do Banco Digital Bank ===
Ag: 1 | Num: 1 | Titular: Camila
Ag: 1 | Num: 2 | Titular: Venilton
~~~

## 🛠️ Tecnologias

- Java 17+
- Git e GitHub

## 📌 Próximas melhorias

- [ ] Interface `IConta` com contrato dos métodos
- [ ] Tratamento de exceções (`SaldoInsuficienteException`)
- [ ] Menu interativo no console com `Scanner`
- [ ] Persistência em arquivo ou banco de dados
- [ ] Taxas para Conta Corrente e rendimento para Poupança

## 👤 Autor

**Nicolas de Oliveira**  
GitHub: [@onicolasoliver](https://github.com/onicolasoliver)

---

⭐ Se este projeto te ajudou, deixe uma estrela no repositório!
