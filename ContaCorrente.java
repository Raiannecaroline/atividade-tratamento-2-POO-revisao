public class ContaCorrente {

    private float limite;
    private float saldo;
    private float valorLimite;

    public ContaCorrente(float valorLimite) {
        this.limite = valorLimite;
        this.saldo = 0.0f;
        this.valorLimite = valorLimite;
    }


    public void sacar(float valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de saque negativo não é permitido");
        }

        if (valor > saldo + limite) {
            throw new IllegalArgumentException("Saque maior que o limite disponível");
        }

        saldo -= valor;
    }

    public void depositar(float valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de depósito negativo não é permitido");
        }

        saldo += valor;
    }

    public void setValorLimite(float valor) throws IllegalArgumentException {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de limite negativo não é permitido");
        }

        valorLimite = valor;
        limite = valor;
    }

}
