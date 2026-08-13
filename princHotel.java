package LPOO;
public class princHotel {

    public static void main(String[] args) {

        reservaHotel reserva1 = new reservaHotel("João Silva", 101, 3, 250.00);
        reservaHotel reserva2 = new reservaHotel("Maria Souza", 202, 5, 300.00);
        System.out.println("=== RESERVAS ===");
        System.out.println(reserva1);
        System.out.println(reserva2);
        double valorNormal = reserva1.calcularHospedagem();
        double valorComDesconto = reserva2.calcularHospedagem(10);
        double valorComDescontoETaxa = reserva2.calcularHospedagem(10, 50.00);
        System.out.printf("%n=== VALORES ===%n");
        System.out.printf("Valor normal da primeira reserva: R$ %.2f%n", valorNormal);
        System.out.printf("Valor da segunda reserva com 10%% de desconto: R$ %.2f%n", valorComDesconto);
        System.out.printf("Segunda reserva com desconto e taxa de serviço: R$ %.2f%n", valorComDescontoETaxa);
    }
}