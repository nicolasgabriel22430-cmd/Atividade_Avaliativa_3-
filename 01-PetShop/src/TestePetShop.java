public class TestePetShop {

    public static void main(String[] args) {
        Animal[] vetor = new Animal[2];
        vetor[0] = new Cachorro("Rex", 3, "Labrador");
        vetor[1] = new Gato("Mia", 2, "curta");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].descrever());
        }

        System.out.println(vetor[0].idadeEmMeses());
        System.out.println(vetor[0].idadeEmMeses(6));
    }
}
