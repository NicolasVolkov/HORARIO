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
            System.out.println("7 -- Fechar --");
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
                        System.out.println("-- Atletismo --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 2){
                        pericia = gerador.nextInt(19) + 1 + forca + 4;
                        System.out.println("-- Luta --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 3){
                        pericia = gerador.nextInt(19) + 1 + forca + 4;
                        System.out.println("-- Pontaria --");
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
                        System.out.println("-- Acrobacia --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 2){
                        pericia = gerador.nextInt(19) + 1 + dex + 4;
                        System.out.println("-- Furtividade --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 3){
                        pericia = gerador.nextInt(19) + 1 + dex + 2;
                        System.out.println("-- Prestigitação --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 4){
                        pericia = gerador.nextInt(19) + 1 + dex + 4;
                        System.out.println("-- Reflexo --");
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
                        System.out.println("-- Fortitude --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 2){
                        pericia = gerador.nextInt(19) + 1 + con + 2;
                        System.out.println("-- Integridade --");
                        System.out.println("Resultado: "+ pericia);
                    } else {
                        System.out.println("Esse número não é de uma perícia");
                    }
                    break;
                case 4:
                    System.out.println("--- PERÍCIA ---");
                    System.out.println("1 -- Astúcia --");
                    System.out.println("2 -- Feitiçaria --");
                    System.out.println("3 -- Investigação --");
                    System.out.println("4 -- História --");
                    System.out.println("5 -- Cozinheiro --");
                    System.out.println("6 -- Religião --");
                    System.out.println("7 -- Tecnologia --");
                    System.out.println("8 -- Direção --");
                    System.out.print("");
                    opcao2 = sc.nextInt();
                    if (opcao2 == 1){
                        pericia = gerador.nextInt(19) + 1 + inte + 2;
                        System.out.println("-- Astúcia --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 2){
                        pericia = gerador.nextInt(19) + 1 + inte + 2;
                        System.out.println("-- Feitiçaria --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 3){
                        pericia = gerador.nextInt(19) + 1 + inte + 2;
                        System.out.println("-- Investigação --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 4){
                        pericia = gerador.nextInt(19) + 1 + inte + 2;
                        System.out.println("-- História --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 5){
                        pericia = gerador.nextInt(19) + 1 + inte + 2;
                        System.out.println("-- Cozinheiro --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 6){
                        pericia = gerador.nextInt(19) + 1 + inte;
                        System.out.println("-- Religião --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 7){
                        pericia = gerador.nextInt(19) + 1 + inte + 2;
                        System.out.println("-- Tecnologia --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 8){
                        pericia = gerador.nextInt(19) + 1 + inte;
                        System.out.println("-- Direção --");
                        System.out.println("Resultado: "+ pericia);
                    } else {
                        System.out.println("Esse número não é de uma perícia");
                    }
                    break;
                case 5:
                    System.out.println("--- PERÍCIA ---");
                    System.out.println("1 -- Intuição --");
                    System.out.println("2 -- Medicina --");
                    System.out.println("3 -- Percepção --");
                    System.out.println("4 -- Ocultismo --");
                    System.out.println("5 -- Vontade --");
                    System.out.println("6 -- Sobrevivência --");
                    System.out.print("");
                    opcao2 = sc.nextInt();
                    if (opcao2 == 1){
                        pericia = gerador.nextInt(19) + 1 + sab + 4;
                        System.out.println("-- Intuição --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 2){
                        pericia = gerador.nextInt(19) + 1 + sab + 2;
                        System.out.println("-- Medicina --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 3){
                        pericia = gerador.nextInt(19) + 1 + sab + 2;
                        System.out.println("-- Percepção --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 4){
                        pericia = gerador.nextInt(19) + 1 + sab + 2;
                        System.out.println("-- Ocultismo --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 5){
                        pericia = gerador.nextInt(19) + 1 + sab + 2;
                        System.out.println("-- Vontade --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 6){
                        pericia = gerador.nextInt(19) + 1 + sab;
                        System.out.println("-- Sobrevivência --");
                        System.out.println("Resultado: "+ pericia);
                    } else {
                        System.out.println("Esse número não é de uma perícia");
                    }
                    break;
                case 6:
                    System.out.println("--- PERÍCIA ---");
                    System.out.println("1 -- Persuasão --");
                    System.out.println("2 -- Enganação --");
                    System.out.println("3 -- Intimidação --");
                    System.out.println("4 -- Performance --");
                    System.out.print("");
                    opcao2 = sc.nextInt();
                    if (opcao2 == 1){
                        pericia = gerador.nextInt(19) + 1 + car + 2;
                        System.out.println("-- Persuasão --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 2){
                        pericia = gerador.nextInt(19) + 1 + car + 2;
                        System.out.println("-- Enganação --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 3){
                        pericia = gerador.nextInt(19) + 1 + car + 2;
                        System.out.println("-- Intimidação --");
                        System.out.println("Resultado: "+ pericia);
                    } else if ( opcao2 == 4){
                        pericia = gerador.nextInt(19) + 1 + car + 2;
                        System.out.println("-- Performance --");
                        System.out.println("Resultado: "+ pericia);
                    } else {
                        System.out.println("Esse número não é de uma perícia");
                    }
                    break;
                case 7:
                    System.out.println("Fechando...");
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        } while (opcao != 7);
    }


}
