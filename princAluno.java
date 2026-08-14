package LPOO;

public class princAluno {
    public static void main(String[] args) {
        aluno Aluno = new aluno("Nicolas", 8, 6);
        aluno Aluno2 = new aluno("Paulo", 5, 8);
        System.out.println(Aluno);
        System.out.println("Média do aluno: " + Aluno.calcularMedia());
        Aluno.verificarSituacao();
        System.out.println(Aluno2);
        System.out.println("Média do aluno: " + Aluno2.calcularMedia());
        Aluno2.verificarSituacao();
    }
}
