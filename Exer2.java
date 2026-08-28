package Ativivis;
import java.util.Scanner;
public class Exer2 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        if (nome.isEmpty()){
            System.out.println("O nome não pode estar vazio");
        } else {
            System.out.println("A palavra digitada é: "+ nome);
            System.out.println("Quantididade de caracteres é: "+ nome.length());
            System.out.println("Letras em maiúsculas: "+ nome.toUpperCase());
            System.out.println("Primeiro caracter: "+ nome.trim().contains(" "));
            if (nome.trim().contains(" ")){
                System.out.println("O nome contém espaço entre as palavras");
            } else {
                System.out.println("O nome não contém espaço entre as palavras");
            }
            if (nome.trim().contains(" ")){
                System.out.println("O nome supostamente é um nome completo");
            } else {
                System.out.println("O nome supostamente é um nome único");
            }
        }

    }
}
