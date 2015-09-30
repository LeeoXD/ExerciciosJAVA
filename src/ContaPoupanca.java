/**
 * Created by pcqs on 30/09/2015.
 */
public class ContaPoupanca extends ContaCorrente {
    private double juros;

    public ContaPoupanca(int num, Pessoa p) {
        super(num,p);
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void depositarRendimento(){
        depositar(getSaldo()*juros/100);
    }
}
