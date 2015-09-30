import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
/**
 * Created by pcqs on 25/09/2015.
 */
@SuppressWarnings("ALL")
public class Cofrinho {

    private ArrayList<Moeda> lista;

    public Cofrinho() {
        lista = new ArrayList<Moeda>();
    }

    public void adicionar(Moeda m) {
        lista.add(m);
    }

    public double calcularTotal() {

        double res = 0;
        for(Moeda m : lista) {
            res += m.getValor();
        }

        return res;
    }

    private static void printMoedas(List<Moeda> cofre, Predicate<Moeda> predicate) {
        cofre.stream()
                .filter(predicate)
                .map(p -> p.getNome())
                .forEach(valor -> System.out.println(valor));
    }

    public static void main(String[] args) {
        Cofrinho cofre = new Cofrinho();
        cofre.adicionar(new Moeda(0.1,"a"));
        cofre.adicionar(new Moeda(0.1, "a"));
        cofre.adicionar(new Moeda(0.5,"a"));
        cofre.adicionar(new Moeda(0.5,"a"));
        cofre.adicionar(new Moeda(0.1,"a"));
        cofre.adicionar(new Moeda(1.1,"a"));
        cofre.adicionar(new Moeda(1.2,"a"));

        printMoedas(cofre.getLista(), p -> p.getValor() > 0.1);

    }

    public ArrayList<Moeda> getLista() {
        return lista;
    }

    public double menorMoeda() {
        double res = Double.MAX_VALUE;

        for(Moeda m : lista) {
            if(m.getValor() < res) res = m.getValor();
        }

        return res;
    }

    public Moeda refMenorMoeda() {
        Moeda res = new Moeda(Double.MAX_VALUE," ");

        for(Moeda m : lista) {
            if(m.getValor() < res.getValor()) res = m;
        }

        return res;
    }

    public HashMap<Double,Integer> frequenciaMoedas() {

        HashMap<Double,Integer> res = new HashMap<Double,Integer>();
        res.put(0.01,0);
        res.put(0.05,0);
        res.put(0.10,0);
        res.put(0.25,0);
        res.put(0.50,0);
        res.put(1.00,0);

        for(Moeda m : lista) {
            int cont = res.get(m.getValor());
            res.put(m.getValor(),cont+1);
        }

        return res;
    }
}
