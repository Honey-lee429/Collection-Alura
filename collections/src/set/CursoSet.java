package set;

import list.Aula;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CursoSet {
    private String nome;
    private String instrutor;
    private Set<AulaSet> aulas = new HashSet<>();
    private Set<AlunoSet> alunoSets = new HashSet<>();

    public CursoSet(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(AulaSet aula) {
        this.aulas.add(aula);
    }

    public void adiciona(AlunoSet aluno) {
        this.alunoSets.add(aluno);
    }

    public Set<AulaSet> getAulas() {
        return aulas;
    }

    public Set<AlunoSet> getAlunoSets() {
        return this.alunoSets;
    }
}
