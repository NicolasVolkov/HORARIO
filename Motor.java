package dirigir;

public class Motor {
    private String cilindrada;
    private int combustivel;
    private boolean ligado;
    Motor(String cilindrada,int combustivel) {
        setCilindrada(cilindrada);
        setCombustivel(combustivel);
        // Todo processador inicia desligado
        this.ligado = false;
    }
    public String getCilindrada() {
        return cilindrada;
    }
    private void setCilindrada(String cilindrada) {
        if (cilindrada != null && !cilindrada.trim().isEmpty()) {
            this.cilindrada = cilindrada;
        } else {
            System.out.println("Erro: a cilindrada não pode ficar vazia.");
        }
    }
    public int getCombustivel() {
        return combustivel;
    }
    private void setCombustivel(
            int combustivel
    ) {
        if (combustivel > 0) {
            this.combustivel = combustivel;
        } else {
            System.out.println("Erro: a quantidade de núcleos deve ser positiva.");
        }
    }
    public boolean isLigado() {
        return ligado;
    }
    public void ligar() {
        if (ligado) {
            System.out.println("O motor já está ligado.");
        } else {
            ligado = true;
            System.out.println("Motor ligado com sucesso.");
        }
    }
    public void desligar() {
        if (!ligado) {
            System.out.println( "O motor já está desligado.");
        } else {
            ligado = false;
            System.out.println("Motor desligado com sucesso.");
        }
    }
    public void apresentarMotor() {
        System.out.println("Cilindrada: " + cilindrada);


        System.out.println("Combustível: "+ combustivel+ " Litros");


        if (ligado) {
            System.out.println("Estado do motor: ligado");
        } else {
            System.out.println("Estado do motor: desligado");
        }
    }
}
