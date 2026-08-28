package Coonta.TipoConta2;

import Coonta.TipoConta1.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {

    private double taxaRendimento;

    public ContaPoupanca(String titular, String numeroConta, double saldo, String nomeBanco, double taxaRendimento) {

        super(titular, numeroConta, saldo, nomeBanco);

        this.taxaRendimento = taxaRendimento;
    }
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
    public void aplicarRendimento() {
        saldo += saldo * (taxaRendimento / 100);
    }
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Taxa de rendimento: "
                + taxaRendimento + "%");
    }
}