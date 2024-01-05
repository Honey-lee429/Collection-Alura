package set;

import java.util.HashSet;
import java.util.Set;

public class TestaSet {

    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatoria, nao imprime objetos repetidos, nao ordena elementos\t--");
        Set<String> alunos = new HashSet<>();
        alunos.add("alberto");
        alunos.add("barbara");
        alunos.add("carla");
        alunos.add("denis");
        alunos.add("denis");

        System.out.println(alunos);
        System.out.println(alunos.size());
    }
}
