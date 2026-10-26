public class TestePapelaria {

    public static void main(String[] args) {
        Produto[] vetor = new Produto[2];
        vetor[0] = new Caderno("Universitario", 20, 96);
        vetor[1] = new Caneta("Bic", 5, "azul");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].descrever());
        }

        System.out.println(vetor[0].precoComDesconto(10));
        System.out.println(vetor[0].precoComDesconto(90, 8));
    }
}
