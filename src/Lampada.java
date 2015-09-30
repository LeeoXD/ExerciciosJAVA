import static java.lang.Math.sqrt;

/**
 * Created by pcqs on 23/09/2015.
 */
public class Lampada {

    private boolean ligada;
    private boolean queimada;
    private int voltagem,potencia;

    public Lampada() {
        ligada = false;
        queimada = false;
        voltagem = potencia = 0;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void ligar() {
        if(!queimada) {
            double sort = Math.random();
            if ((sort >= 0.1) && (sort <= 0.3)) {
                queimada = true;
            }
            else {
                ligada = true;
            }
        }
    }

    public void desligar() {
        if(!queimada) {
            ligada = false;
        }
    }

    public boolean isQueimada() {
        return queimada;
    }

    public void setQueimada(boolean queimada) {
        this.queimada = queimada;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String toString() {
        return "Ligada: " + isLigada() + "\nQueimada: " + isQueimada();
    }
}
