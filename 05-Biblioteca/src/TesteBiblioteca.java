public class TesteBiblioteca {

    public static void main(String[] args) {
        Publicacao[] vetor = new Publicacao[2];
        vetor[0] = new Livro("Dom Casmurro", 1899, 256);
        vetor[1] = new Revista("Ciencia Hoje", 2024, 301);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].citar());
        }

        System.out.println(vetor[0].emprestar(7));
        System.out.println(vetor[0].emprestar(7, "Ana"));
    }
}
