
public class veiculo {
    String modelo;
    String marca;
    int velocidade;
    public veiculo(String modelo, String marca, int velocidade){
        this.modelo = modelo;
        this.marca = marca;
        this.velocidade = velocidade;
    }
    public void acelerar(int valor) {
        if (valor > 0 ){
            velocidade = velocidade + valor;
            System.out.println("O veículo acelerou" +valor+"Km/h");
        } else {
            System.out.println("O valor para a aceleração deve ser positiva");
        }
    }
    public void frear(int valor) {
        if (valor <= 0) {
            System.out.println("O valor para frear deve ser positivo");
        } else {
            if (valor >= velocidade) {
                velocidade = 0;
            } else {
                velocidade = velocidade - valor;
                System.out.println("O veículo reduziu " + valor + "Km/h");
            }
        }
    }
    public void mostrarDados () {
        System.out.println("Modelo do carro:" + modelo);
        System.out.println("Marca do carro:" + marca);
        System.out.println("Velocidade do carro:" + velocidade);
    }
}
