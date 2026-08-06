import java.util.Scanner;
public class multmatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha1 = 0;
        int linha2 = 0;
        int col1 = 0;
        int col2 = 0;
        System.out.println("Digite o número de linhas da primeira matriz:");
        linha1 = sc.nextInt();
        System.out.println("Digite o número de colunas da primeira matriz:");
        col1 = sc.nextInt();
        System.out.println("Digite o número de linhas da segunda matriz:");
        linha2 = sc.nextInt();
        System.out.println("Digite o número de colunas da segunda matriz:");
        col2 = sc.nextInt();
        int[][] A = new int[linha1][col1];
        int[][] B = new int[linha2][col2];
        int[][] C = new int[linha1][col2];
        if (col1 != linha2) {
            System.out.println("Não é possível multiplicar as matrizes...");
            System.exit(0);
        }
        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < linha1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("A[" + (i+1) + "][" + (j+1) + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nDigite os elementos da matriz B:");
        for (int i = 0; i < linha2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("B[" + (i+1) + "][" + (j+1) + "] = ");
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < linha1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("\nMatriz Final:");
        for (int i = 0; i < linha1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(C[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}