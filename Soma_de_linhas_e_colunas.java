package Exer_de_Matrizes;
import java.util.Scanner;
public class Soma_de_linhas_e_colunas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas: ");
        int linha = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        int coluna = sc.nextInt();
        int[][] matriz = new int[linha][coluna];
        System.out.println("\nDigite os elementos da matriz:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Variáveis para as somas
        int somaTotal = 0;
        int[] somaLinhas = new int[linha];
        int[] somaColunas = new int[coluna];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                int elemento = matriz[i][j];
                somaTotal += elemento;
                somaLinhas[i] += elemento;
                somaColunas[j] += elemento;
            }
        }
        System.out.println("\nMatriz:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nSoma de todos os elementos: " + somaTotal);
        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < linha; i++) {
            System.out.println("Linha " + i + ": " + somaLinhas[i]);
        }
        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < coluna; j++) {
            System.out.println("Coluna " + j + ": " + somaColunas[j]);
        }

        sc.close();
    }
}
