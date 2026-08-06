import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        System.out.println("\n--- MENU ---");
        System.out.println("1 - Soma");
        System.out.println("2 - Fazer média");
        System.out.println("3 - Verificar situação");
        System.out.println("4 - Mostrar resultado");
        System.out.print("Escolha: ");
        opcao = sc.nextInt();
        System.out.println(" Nota 1: 100");
        System.out.println(" Nota 2: 30");
        System.out.println(" Nota 3: 70");
        switch (opcao) {

            case 1: // soma
                System.out.print("Soma das notas 100, 30 e 70: " + somarNotas(100, 30, 70));
                break;

            case 2: // média
                System.out.print("Média das notas 100, 30 e 70: " + calcularMedia(100, 30, 70));
                break;

            case 3: // verificar
                 System.out.println("Parabéns! Você foi " + verificarSituacao(100,30,70));
                break;

            case 4: // resultado
                  mostrarResultado(100,30,70);
                break;
            default:
                System.out.println("Opção inválida!");
        }
        sc.close();
    }
    public static int somarNotas(int nota1, int nota2, int nota3){
        return(nota1 + nota2 + nota3);
    }
    public static int calcularMedia(int nota1, int nota2, int nota3){
        return(somarNotas(nota1, nota2, nota3)/3);
    }
    public static String verificarSituacao(int nota1, int nota2, int nota3){
        if (calcularMedia(nota1,nota2,nota3) >= 70) {
            return("aprovado");
        } else {
            return("reprovado");
        }
    }
    public static void mostrarResultado(int nota1, int nota2, int nota3){
        System.out.println("Soma das notas: " + somarNotas(nota1, nota2, nota3));
        System.out.println("Média das notas: " + calcularMedia(nota1, nota2, nota3));
        System.out.println("Situação acadêmica: " + verificarSituacao(nota1 , nota2, nota3));
    }
}
