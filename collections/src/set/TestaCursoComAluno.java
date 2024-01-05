package set;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        CursoSet cursoSet = new CursoSet("poo", "paulo");

        // Adiciona aulas dentro do curso
        cursoSet.adiciona(new AulaSet("java", 100));
        cursoSet.adiciona(new AulaSet("java", 100));
        cursoSet.adiciona(new AulaSet("python", 50));
        cursoSet.adiciona(new AulaSet("c++", 504));

        // Adiciona alunos dentro do curso
        cursoSet.adiciona(new AlunoSet("maria", 1234));
        cursoSet.adiciona(new AlunoSet("paloma", 2341));
        cursoSet.adiciona(new AlunoSet("jorge", 3234));

        cursoSet.getAulas().forEach(System.out::println);

        System.out.println(cursoSet); // set.CursoSet@52cc8049
        System.out.println(cursoSet.getAlunoSets()); // [set.AlunoSet@7ef20235, set.AlunoSet@2d98a335, set.AlunoSet@16b98e56]
        System.out.println(cursoSet.getAulas());

    }
}
