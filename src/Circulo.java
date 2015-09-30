/**
 * Created by pcqs on 23/09/2015.
 */
public class Circulo {

    private int x;
    private int y;
    private int raio;

    public Circulo(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.raio = r;
    }

    public Circulo(int x, int y) {
        this(x,y,1);
    }

    public Circulo(int r) {
        this(0,0,r);
    }

    public Circulo(Ponto p, int r) {
        if(p == null) throw new NullPointerException("Ponto é null");
        if(r < 0) throw new IllegalArgumentException("Raio é negativo");
        setX(p.getX());
        setY(p.getY());
        setRaio(r);
    }

    public Circulo(int dia, Ponto p) {
        this(p.getX(),p.getY(),dia/2);
    }

    public Circulo(Circulo c) {
        this(c.getX(),c.getY(),c.getRaio());
    }

    public void Incrementa() {
        raio++;
    }

    public void Decrementa() {
        raio--;
    }

    public void move(Ponto p) {
        setX(p.getX());
        setY(p.getY());
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String toString() {
        return "Centro: (" + x + "," + y + ")" + " Raio: " + raio;
    }
}
