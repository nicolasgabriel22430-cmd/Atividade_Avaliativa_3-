public class TesteLanchonete {

    public static void main(String[] args) {
        Item[] vetor = new Item[2];
        vetor[0] = new Lanche("X-burguer", 18, 2);
        vetor[1] = new Bebida("Suco", 8, 300);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].descrever());
        }

        System.out.println(vetor[0].total());
        System.out.println(vetor[0].total(2));
    }
}
