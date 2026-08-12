public class princBanc {
    public static void main(String[] args) {
        ContaBancaria con= new ContaBancaria("Paulo", 34, 300);
        con.depositar(34);
        con.sacar(200);
        con.mostrarSaldo();
    }

}
