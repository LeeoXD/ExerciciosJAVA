/**
 * Created by pcqs on 30/09/2015.
 */
public class Pessoa {
    private String nome, cpf;

    public Pessoa(String nome, String cpf) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
