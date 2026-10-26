public class TesteImobiliaria {

    public static void main(String[] args) {
        Imovel[] vetor = new Imovel[2];
        vetor[0] = new Casa("Rua A, 10", 80, 3);
        vetor[1] = new Apartamento("Rua B, 200", 60, 5);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].descrever());
        }

        System.out.println(vetor[0].valorEstimado(3000));
        System.out.println(vetor[0].valorEstimado(3000, 2000));
    }
}
