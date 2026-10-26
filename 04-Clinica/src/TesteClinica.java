public class TesteClinica {

    public static void main(String[] args) {
        Pessoa[] vetor = new Pessoa[2];
        vetor[0] = new Paciente("Carla", "Unimed");
        vetor[1] = new Medico("Diego", "Clinica");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i].ficha());
        }

        System.out.println(vetor[0].agendar("12/10/2026"));
        System.out.println(vetor[0].agendar("12/10/2026", "14:00"));
    }
}
