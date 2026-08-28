package Coonta.Princ;

import Coonta.TipoConta2.ContaPoupanca;
public class Principal {
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca("João da Silva", "12345-6", 1000.00, "Banco do Brasil", 0.5);
        System.out.println("--- DADOS DA CONTA ---");
        conta.mostrarDados();

        System.out.println("\n--- DEPÓSITO ---");
        conta.depositar(500.00);
        System.out.println("Saldo após depósito: R$ "
                + conta.getSaldo());

        System.out.println("\n--- SAQUE ---");
        conta.sacar(200.00);
        System.out.println("Saldo após saque: R$ "
                + conta.getSaldo());

        System.out.println("\n--- RENDIMENTO ---");
        conta.aplicarRendimento();
        System.out.println("Saldo após rendimento: R$ "
                + conta.getSaldo());

        System.out.println("\n--- DADOS ATUALIZADOS ---");
        conta.mostrarDados();
    }
}