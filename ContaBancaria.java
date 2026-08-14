package LPOO;

public class ContaBancaria {
    String titular;
    int numero;
    int saldo;
    public ContaBancaria(String titular, int numero, int saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    public void depositar(double valor) {
             saldo += valor;
            System.out.println("Foi adicionado " +valor+" reais depositados");
    }
    public void sacar(double valor) {
        if (valor > saldo ) {
            System.out.println("O valor para saque deve ser menor que o saldo");
        } else {
            saldo -=  valor;
            System.out.println("O saque foi feito com sucesso!");
        }
    }
    public void transferir(ContaBancaria destino, double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            destino.saldo += valor;
            System.out.println("Transferência de " + valor + " reais concluída");
        } else {
            System.out.println("Valor de transfêrencia é incompatível com a conta...");
        }
    }
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo da conta: " + saldo);
    }
}
