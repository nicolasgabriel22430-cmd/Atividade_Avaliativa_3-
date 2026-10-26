public class Van extends Transporte {

    private int lugares;

    public Van(String linha, int lugares) {
        super(linha);
        this.lugares = lugares;
    }

    // Sobrescrita: mesma assinatura, comportamento especializado
    @Override
    public String anunciar() {
        return "Van da linha " + linha + ", " + lugares + " lugares";
    }
}
