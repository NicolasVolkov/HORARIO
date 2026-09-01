package Exer_de_Matrizes;

import java.util.Scanner;

public class Maior_Menor_Matriz {
    static void main(String[] args) {
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
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                int elemento = matriz[i][j];
                if (elemento > maior) {
                    maior = elemento;
                }
                if (elemento < menor) {
                    menor = elemento;
                }
            }
        }
        System.out.println("\nMatriz:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
        System.out.println("Posições do maior elemento:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] == maior) {
                    System.out.println("Linha " + i + ", Coluna " + j);
                }
            }
        }
        System.out.println("Posições do menor elemento:");
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (matriz[i][j] == menor) {
                    System.out.println("Linha " + i + ", Coluna " + j);
                }
            }
        }
    }
}
