public class Banco {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(1000.0f);

        try {
            conta.depositar(500.0f);
            conta.sacar(300.0f);
            conta.setValorLimite(1500.0f);
            conta.sacar(1000.0f);
            conta.depositar(-200.0f); // Isso deve lançar uma exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
