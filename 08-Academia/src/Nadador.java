public class Nadador extends Atleta {

    private String estilo;

    public Nadador(String nome, String estilo) {
        super(nome);
        this.estilo = estilo;
    }

    // Sobrescrita: mesma assinatura, comportamento especializado
    @Override
    public String apresentar() {
        return "Nadador: " + nome + ", estilo " + estilo;
    }
}
