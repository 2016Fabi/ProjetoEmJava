package dio.PPOA;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);
        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(2000); // Teste de saldo insuficiente
    }
}