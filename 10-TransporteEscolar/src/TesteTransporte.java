public class TesteTransporte {

    public static void main(String[] args) {
        Transporte[] vetor = new Transporte[2];
        vetor[0] = new Van("Centro", 15);
        vetor[1] = new OnibusEscolar("Bairro", 2);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].anunciar());
        }

        System.out.println(vetor[0].lotacao(12));
        System.out.println(vetor[0].lotacao(12, 15));
    }
}
