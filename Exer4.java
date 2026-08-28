package Ativivis;
import java.util.Scanner;
public class Exer4 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String nome = entrada.nextLine();
        nome = nome.trim();
        if (nome.isEmpty()){
            System.out.println("O nome do arquivo não pode estar vazio");
        } else if (nome.toLowerCase().contains(".pdf")){
            nome = nome.replaceAll(" ", "_");
            System.out.println("Nome do arquivo em letras minúsculas é: "+ nome.toLowerCase());
            System.out.println("Nome do arquivo sem o tipo é: "+ nome.toLowerCase().replaceFirst(".pdf", ""));

        } else {
            System.out.println("O nome do arquivo deve ser em pdf ");
        }
    }
}
