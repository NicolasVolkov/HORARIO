package LPOO;
public class reservaHotel {
    private String nomeHospede;
    private int numeroQuarto;
    private int quantidadeDiarias;
    private double valorDiaria;
    public reservaHotel(String nomeHospede, int numeroQuarto, int quantidadeDiarias, double valorDiaria) {
        setNomeHospede(nomeHospede);
        setNumeroQuarto(numeroQuarto);
        setQuantidadeDiarias(quantidadeDiarias);
        setValorDiaria(valorDiaria);
    }
    public String getNomeHospede() {
        return nomeHospede;
    }
    public void setNomeHospede(String nomeHospede) {
        if (nomeHospede == " ") {
            System.out.println("O nome do hóspede não pode ficar vazio.");
        }
        this.nomeHospede = nomeHospede;
    }
    public int getNumeroQuarto() {
        return numeroQuarto;
    }
    public void setNumeroQuarto(int numeroQuarto) {
        if (numeroQuarto <= 0) {
            System.out.println("O número do quarto deve ser positivo.");
        }
        this.numeroQuarto = numeroQuarto;
    }
    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }
    public void setQuantidadeDiarias(int quantidadeDiarias) {
        if (quantidadeDiarias <= 0) {
            System.out.println("A quantidade de diárias deve ser maior que zero.");

        }
        this.quantidadeDiarias = quantidadeDiarias;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria <= 0) {
            System.out.println("O valor da diária deve ser maior que zero.");


        }
        this.valorDiaria = valorDiaria;
    }
    public double calcularHospedagem() {
        return quantidadeDiarias * valorDiaria;
    }
    public double calcularHospedagem(double percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            System.out.println("O desconto deve estar entre 0 e 100.");
        }
        double valorNormal = calcularHospedagem();
        double desconto = valorNormal * percentualDesconto / 100;
        return valorNormal - desconto;
    }
    public double calcularHospedagem(double percentualDesconto, double taxaServico) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            System.out.println("O desconto deve estar entre 0 e 100.");
        }
        if (taxaServico < 0) {
            System.out.println("A taxa de serviço não pode ser negativa.");
        }
        double valorComDesconto = calcularHospedagem(percentualDesconto);
        return valorComDesconto + taxaServico;
    }
    @Override
    public String toString() {
        return "nomeHospede='" + nomeHospede + " " + ", numeroQuarto= " + numeroQuarto + ", quantidadeDiarias= " + quantidadeDiarias + ", valorDiaria= " + valorDiaria;
    }
}