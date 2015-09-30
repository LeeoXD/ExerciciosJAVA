import java.util.List;

/**
 * Created by pcqs on 30/09/2015.
 */
public interface ContasDAO {

    void adicionar(ContaCorrente conta);
    List<ContaCorrente> buscar();
    ContaCorrente buscar(int numeroConta);
    List<ContaCorrente> buscar(String cpfTitular);
}
