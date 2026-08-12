
public class produto {
    String nome;
    int preco;
    int quant;
    public produto(String nome, int preco, int quant){
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }
    public void apresentarProduto(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade no estoque: " + quant);
    }
}
