package set;

public class AlunoSet {

    private String nome;
    private int matricula;

    public AlunoSet(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
}
