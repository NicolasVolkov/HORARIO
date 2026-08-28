package Ativivis;
import java.util.Scanner;
public class Exer1 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String palavra = entrada.nextLine();
        //Apresentar a palavra digitada
        if (palavra.isEmpty()){
            System.out.println("A palavra não pode estar vazia");
        } else {
            System.out.println("A palavra digitada é: "+ palavra);
            System.out.println("Quantididade de caracteres é: "+ palavra.length());
            System.out.println("Letras em maiúsculas: "+ palavra.toUpperCase());
            System.out.println("Letras em minúsculas: "+ palavra.toLowerCase());
            System.out.println("Primeiro caracter: "+ palavra.charAt(0));
            System.out.println("Último caracter: "+ palavra.charAt(palavra.length() - 1));
        }

    }
}
