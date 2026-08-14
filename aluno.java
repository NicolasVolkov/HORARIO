package LPOO;

public class aluno {
    private String nome;
    private double nota1;
    private double nota2;
    public aluno(String nome, double nota1, double nota2){
        setNome(nome);
        setNota1(nota1);
        setNota2(nota2);
    }
    public String getNome() {return nome; }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double calcularMedia() {
        double media = (nota1 + nota2)/2;
        return media;
    }
    public void verificarSituacao(){
        if (calcularMedia() >= 7){
            System.out.println("Você foi aprovado!!");
        } else if(calcularMedia() >= 5){
            System.out.println("Você ficou de recuperação");
        } else {
            System.out.println("Você está reprovado!!");
        }
    }
    @Override
    public String toString() {
        return "---ALUNO---\n" + "Nome do aluno='" + nome + "\nNota 1= " + nota1 + "\nNota 2= " + nota2;
    }
}
