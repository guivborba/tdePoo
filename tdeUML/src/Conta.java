import java.util.Date;

public class Conta {
    private int numeroDaConta;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente){
        System.out.println(cliente.getNome());
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    public void transfere(Date minhaData) {
        minhaData.getTime();
    }
    public double consultaSaldo(){
        return 0.0;
    }



}
