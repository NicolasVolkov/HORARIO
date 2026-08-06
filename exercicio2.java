public class exercicio2 {
    public static void main(String[] args) {
        calcularDesconto(100, 30);
    }
    public static void calcularDesconto(double preco, double porcentagem){
        System.out.println("Preço do produto: " + preco);
        System.out.println("Percentual de desconto: " + porcentagem+ "%");
        System.out.println("resultado final: " + (preco - (preco * (porcentagem/100))));
    }
}
