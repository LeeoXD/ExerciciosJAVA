/**
 * Created by pcqs on 25/09/2015.
 */
public class Moeda {

    private double valor;
    private String nome;

    public Moeda(double v, String n) {
        valor = v;
        nome = n;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
