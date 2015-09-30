import java.util.List;

/**
 * Created by pcqs on 23/09/2015.
 */
public class App {

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente(25,new Pessoa("João","1234576"));
        ContaCorrente c2 = new ContaCorrente(22, new Pessoa("Ana","12345678"));
        ContaCorrente c3 = new ContaCorrente(21, new Pessoa("Ana","12345678"));
        ContaCorrente c4 = new ContaCorrente(20, new Pessoa("Ana","12345678"));
        ContaCorrente c5 = new ContaCorrente(19, new Pessoa("Ana","12345678"));
        CadastroContas contas = new CadastroContas();
        contas.adicionar(c1);
        contas.adicionar(c2);
        contas.adicionar(c3);
        contas.adicionar(c4);
        contas.adicionar(c5);
        System.out.println(contas.buscar(25).getTitular().getNome());
        List<ContaCorrente> c = contas.buscar("12345678");
        for(ContaCorrente cont : c) {
            System.out.println(cont.getTitular().getNome() + " " + cont.getNumero() + "\n");
        }
    }

}
