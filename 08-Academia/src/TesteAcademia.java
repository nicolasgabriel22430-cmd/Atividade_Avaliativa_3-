public class TesteAcademia {

    public static void main(String[] args) {
        Atleta[] vetor = new Atleta[2];
        vetor[0] = new Corredor("Lia", 10);
        vetor[1] = new Nadador("Paulo", "crawl");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].apresentar());
        }

        System.out.println(vetor[0].registrarTempo(55.2));
        System.out.println(vetor[0].registrarTempo(58, "100m"));
    }
}
