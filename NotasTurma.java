package AT09;
import java.util.Scanner;
public class NotasTurma {
    public static void main(String[] args) {
        double nota[] = new double[6];
        preencherNotas(nota);
        mostrarCabecalho();
        mostrarNotas(nota);
        System.out.println("Média da turma: "+ calcularMedia(nota));
        System.out.println("Aprovados: "+ contarAprovados(nota));
        System.out.println("Reprovados: "+ contarReprovados(nota));

    }
    public static void mostrarCabecalho(){
        System.out.println("---- ANÁLISE DAS NOTAS DA TURMA ----");
        System.out.println("");
    }
    public static void preencherNotas(double[] nota){
        Scanner sc = new Scanner(System.in);
        System.out.println("Notas(de 0.0 a 10.0):");
        for (int i = 0; i < 6; i++) {
            System.out.print("");
            nota[i] = sc.nextDouble();
        }
    }
    public static double  calcularMedia(double[] nota){
        double media = 0;
        for (int i = 0; i < 6; i++) {
            media += nota[i];
        }
        media = media / 6;
        return media;
    }
    public static int contarAprovados(double[] nota){
        int aprov = 0;
        for (int i = 0; i < 6; i++) {
            if (nota[i] >= 6.0){
                aprov++;
            }
        }
        return aprov;
    }
    public static int contarReprovados(double[] nota){
        int reprov = 0;
        for (int i = 0; i < 6; i++) {
            if (nota[i] < 6.0){
                reprov++;
            }
        }
        return reprov;
    }
    public static void mostrarNotas(double[] nota){
        for (int i = 0; i < 6; i++) {
            System.out.println("Nota "+ (i+1) + " : "+ nota[i]);
        }
    }
}
