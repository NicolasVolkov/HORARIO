package Ativivis;
import java.util.Scanner;
public class Exer5 {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome completo: ");
        String nomeCompleto = entrada.nextLine();
        nomeCompleto = nomeCompleto.trim();
        if (nomeCompleto.isEmpty()) {
            System.out.println("Erro: o nome não pode estar vazio.");
        } else {
            String[] nomes = nomeCompleto.split("\\s+");
            if (nomes.length < 2) {
                System.out.println("Informe pelo menos um nome e um sobrenome.");
            } else {
                String primeiroNome = nomes[0];
                String ultimoSobrenome = nomes[nomes.length - 1];
                String usuario = primeiroNome.toLowerCase() + "." + ultimoSobrenome.toLowerCase();
                System.out.println("\nNome de usuário gerado: " + usuario);
            }
        }
        entrada.close();
    }
}