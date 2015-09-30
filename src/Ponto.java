import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Created by pcqs on 23/09/2015.
 */
public class Ponto {

    private int x,y;

    public Ponto() {
        x = y = 0;
    }

    public Ponto(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

    public Ponto(Ponto p) {
        this(p.getX(),p.getY());
    }

    public double distPontos(Ponto p) {
        return sqrt(pow(p.getX() - this.x, 2) + pow(p.getY() - this.y, 2));
    }

    public double distPontos(int x, int y) {
        return sqrt(pow(x - this.x, 2) + pow(y - this.y, 2));
    }

    public double distPontos(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
