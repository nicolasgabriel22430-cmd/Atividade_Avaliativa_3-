public class TesteCinema {

    public static void main(String[] args) {
        Ingresso[] vetor = new Ingresso[2];
        vetor[0] = new MeiaEntrada("Divertida Mente", 40, "carteira 123");
        vetor[1] = new Vip("Duna", 40, "A");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].valorFinal());
        }

        System.out.println(vetor[0].resumo());
        System.out.println(vetor[0].resumo(true));
    }
}
