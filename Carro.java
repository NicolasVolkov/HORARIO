package dirigir;
public class Carro {
    // Atributos próprios do computador
    private String marca;
    private String modelo;
    private Motor motor;
    public Carro(String marca,String modelo,String cilindrada, int combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(cilindrada, combustivel);
    }
    public void ligarCarro() {
        System.out.println("Ligando o carro " + modelo + "...");
        motor.ligar();
    }
    public void desligarCarro() {
        System.out.println("Desligando o carro " + modelo + "...");
        motor.desligar();
    }
    public void apresentarCarro() {
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo do carro: " + modelo);
        motor.apresentarMotor();
    }
}
