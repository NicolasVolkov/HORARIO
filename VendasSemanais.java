package AT09;

import java.util.Scanner;

public class VendasSemanais {
    public static void mostrarCabecalho() {
        System.out.println("--- CONTROLE DE VENDAS SEMANAIS ---");
    }
    public static void preencherVendas(int[] vendas, Scanner entrada) {
        for (int i = 0; i < vendas.length; i++) {
            System.out.print("Digite a quantidade vendida no " + (i + 1) + "º dia: ");
            vendas[i] = entrada.nextInt();
        }
    }
    public static int calcularTotal(int[] vendas) {
        int total = 0;

        for (int venda : vendas) {
            total += venda;
        }

        return total;
    }
    public static int encontrarMaiorVenda(int[] vendas) {
        int maior = vendas[0];

        for (int i = 1; i < vendas.length; i++) {
            if (vendas[i] > maior) {
                maior = vendas[i];
            }
        }

        return maior;
    }
    public static int contarDiasMetaAtingida(int[] vendas, int meta) {
        int quantidadeDias = 0;

        for (int venda : vendas) {
            if (venda >= meta) {
                quantidadeDias++;
            }
        }

        return quantidadeDias;
    }
    public static void mostrarVendas(int[] vendas) {
        System.out.println("\nVENDAS POR DIA:");

        for (int i = 0; i < vendas.length; i++) {
            System.out.println((i + 1) + "º dia: " + vendas[i] + " produtos");
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vendas = new int[7];
        mostrarCabecalho();
        preencherVendas(vendas, entrada);
        System.out.print("\nDigite a meta diária de vendas: ");
        int meta = entrada.nextInt();
        int total = calcularTotal(vendas);
        int maiorVenda = encontrarMaiorVenda(vendas);
        int diasMeta = contarDiasMetaAtingida(vendas, meta);
        double media = (double) total / vendas.length;
        mostrarVendas(vendas);
        System.out.println("\n");
        System.out.println("--- RESULTADO DA SEMANA ---");
        System.out.println("");
        System.out.println("Total de produtos vendidos: " + total);
        System.out.printf("Média diária de vendas: ", media);
        System.out.println("Maior quantidade vendida: " + maiorVenda);
        System.out.println("Dias em que a meta foi atingida: " + diasMeta);
        entrada.close();
    }
}