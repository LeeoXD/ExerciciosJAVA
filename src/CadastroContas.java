import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by pcqs on 30/09/2015.
 */
public class CadastroContas implements ContasDAO {
    private ArrayList<ContaCorrente> contas;

    public CadastroContas() {
        contas = new ArrayList<ContaCorrente>();
    }

    public void adicionar(ContaCorrente conta) {
        contas.add(conta);
    }

    public List<ContaCorrente> buscar() {
        return contas;
    }

    private static ContaCorrente retorna(ContaCorrente c) {
        return c;
    }

    public ContaCorrente buscar(int numeroConta) {
        Optional<ContaCorrente> conta = contas.stream()
                .filter(c -> c.getNumero() == numeroConta)
                .findFirst();
        return conta.get();
    }

    public List<ContaCorrente> buscar(String cpfTitular) {
        List<ContaCorrente> resp = contas.stream()
                .filter(c -> c.getTitular().getCpf() == cpfTitular)
                .collect(Collectors.toList());
        return resp;
    }
}
