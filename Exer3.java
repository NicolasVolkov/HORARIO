package Ativivis;

import java.util.Scanner;

public class Exer3 {
    static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = entrada.nextLine();
        System.out.print("Digite a palavra que deseja procurar: ");
        String palavra = entrada.nextLine();
        String fraseMinuscula = frase.toLowerCase();
        String palavraMinuscula = palavra.toLowerCase();
        int primeiraPosicao = fraseMinuscula.indexOf(palavraMinuscula);
        int ultimaPosicao = fraseMinuscula.lastIndexOf(palavraMinuscula);
        if (primeiraPosicao != -1) {

            System.out.println("Palavra encontrada");
            System.out.println("Primeira ocorrência: posição " + primeiraPosicao);
            System.out.println("Última ocorrência: posição " + ultimaPosicao);

        } else {

            System.out.println("A palavra não foi encontrada na frase.");

        }
    }

}
