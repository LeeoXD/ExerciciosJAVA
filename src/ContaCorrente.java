/**
 * Created by pcqs on 30/09/2015.
 */
public class ContaCorrente {
    private int numero;
    private double saldo;
    private Pessoa titular;

    public ContaCorrente(int num, Pessoa p) {
        numero = num;
        titular = p;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if(saldo >= valor) {
            saldo -= valor;
        }
    }
}
