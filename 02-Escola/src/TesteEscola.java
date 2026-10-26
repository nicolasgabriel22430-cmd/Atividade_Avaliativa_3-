public class TesteEscola {

    public static void main(String[] args) {
        Funcionario[] vetor = new Funcionario[2];
        vetor[0] = new Professor("Ana", 3000, "POO");
        vetor[1] = new Coordenador("Bruno", 4500, "Pedagogico");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].descrever());
        }

        System.out.println(vetor[0].bonificacao());
        System.out.println(vetor[0].bonificacao(20));
    }
}
