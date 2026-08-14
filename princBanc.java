package LPOO;

public class princBanc {
    public static void main(String[] args) {
        ContaBancaria con= new ContaBancaria("Paulo", 34, 300);
        ContaBancaria con2 = new ContaBancaria("José", 42, 310);
        con.depositar(34);
        con.sacar(200);
        con.mostrarSaldo();
        con2.mostrarSaldo();
        con.transferir(con2, 50);
        con.mostrarSaldo();
        con2.mostrarSaldo();
    }

}
