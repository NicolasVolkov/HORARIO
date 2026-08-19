package Heranca1;

public class Principal {

    public static void main(String[] args) {

        Gerente gerente = new Gerente(
                "Carlos Silva",
                1001,
                8000.00,
                2000.00
        );

        Vendedor vendedor = new Vendedor(
                "Ana Souza",
                1002,
                3000.00,
                25000.00,
                5.0
        );

        Estagiario estagiario = new Estagiario(
                "Lucas Oliveira",
                1003,
                1500.00,
                "Universidade Federal do Paraná"
        );

        System.out.println("========== GERENTE ==========");
        gerente.apresentarDados();
        System.out.printf(
                "Salário final: R$ %.2f%n",
                gerente.calcularSalario()
        );
        gerente.realizarReuniao();

        System.out.println();

        System.out.println("========== VENDEDOR ==========");
        vendedor.apresentarDados();
        System.out.printf(
                "Salário final: R$ %.2f%n",
                vendedor.calcularSalario()
        );
        vendedor.registrarVenda();

        System.out.println();

        System.out.println("========== ESTAGIÁRIO ==========");
        estagiario.apresentarDados();
        System.out.printf(
                "Salário final: R$ %.2f%n",
                estagiario.calcularSalario()
        );
        estagiario.realizarTreinamento();
    }
}