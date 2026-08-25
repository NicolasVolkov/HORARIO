package dirigir;

public class Principal {


    public static void main(String[] args) {
        /*
         * O programa principal cria somente
         * o objeto Computador.
         * O próprio Computador criará internamente
         * seu objeto Processador.
         */
        Carro carro= new Carro("Volksvagen", "bunbun", "eggs",34);


        System.out.println("DADOS INICIAIS");
        carro.apresentarCarro();


        System.out.println("\nLIGANDO");
        carro.ligarCarro();


        System.out.println("\nDADOS ATUALIZADOS");
        carro.apresentarCarro();


        System.out.println("\nDESLIGANDO");
        carro.desligarCarro();
    }
}
