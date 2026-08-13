package RPG_Tadao;
import java.util.Scanner;
import java.util.Random;
public class soraShio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        String nome = "Sora Shio";
        int vida = 62;
        int ener = 30;
        int san = 28;
        int armadura = 20;
        int nivel = 4;
        int forca = 4;
        int dex = 3;
        int con = 3;
        int inte = 1;
        int sab = 1;
        int car = 2;
        int opcao = 0;
        int empolgacao = 1;
        int opcao2 = 0;
        int pericia = 0;
        do {
            System.out.println("--- ATRIBUTO ---");
            System.out.println("1 -- Força --");
            System.out.println("2 -- Destreza --");
            System.out.println("3 -- Constituição --");
            System.out.println("4 -- Inteligência --");
            System.out.println("5 -- Sabedoria --");
            System.out.println("6 -- Carisma --");
            System.out.println("7 -- Carisma --");
            System.out.print("");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("--- PERÍCIA ---");
                    System.out.println("1 -- Atletismo --");
                    System.out.println("2 -- Luta --");
                    System.out.println("3 -- Pontaria --");
                    System.out.print("");
                    opcao2 = sc.nextInt();
                    if (opcao2 == 1){
                        pericia = gerador.nextInt(19) + 1 + forca + 4;
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 2){
                        pericia = gerador.nextInt(19) + 1 + forca + 4;
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao == 3){
                        pericia = gerador.nextInt(19) + 1 + forca + 4;
                        System.out.println("Resultado: "+ pericia);
                    } else {
                        System.out.println("Esse número não é de uma perícia");
                    }
                    break;
                case 2:
                    System.out.println("--- PERÍCIA ---");
                    System.out.println("1 -- Acrobacia --");
                    System.out.println("2 -- Furtividade --");
                    System.out.println("3 -- Prestigitação --");
                    System.out.println("4 -- Reflexo --");
                    System.out.print("");
                    opcao2 = sc.nextInt();
                    if (opcao2 == 1){
                        pericia = gerador.nextInt(19) + 1 + dex + 2;
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 2){
                        pericia = gerador.nextInt(19) + 1 + dex + 4;
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao == 3){
                        pericia = gerador.nextInt(19) + 1 + dex + 2;
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao == 4){
                        pericia = gerador.nextInt(19) + 1 + dex + 4;
                        System.out.println("Resultado: "+ pericia);
                    } else {
                        System.out.println("Esse número não é de uma perícia");
                    }
                    break;
                case 3:
                    System.out.println("--- PERÍCIA ---");
                    System.out.println("1 -- Fortitude --");
                    System.out.println("2 -- Integridade --");
                    System.out.print("");
                    opcao2 = sc.nextInt();
                    if (opcao2 == 1){
                        pericia = gerador.nextInt(19) + 1 + con + 4;
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 2){
                        pericia = gerador.nextInt(19) + 1 + con + 2;
                        System.out.println("Resultado: "+ pericia);
                    } else {
                        System.out.println("Esse número não é de uma perícia");
                    }
                    break;
            }
        } while (opcao != 30);
    }


}
