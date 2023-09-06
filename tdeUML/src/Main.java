public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Joao");
        Conta contaCorrente = new Conta(cliente1);
    }
}