public class Corredor extends Atleta {

    private double distanciaKm;

    public Corredor(String nome, double distanciaKm) {
        super(nome);
        this.distanciaKm = distanciaKm;
    }

    // Sobrescrita: mesma assinatura, comportamento especializado
    @Override
    public String apresentar() {
        return "Corredor: " + nome + ", " + distanciaKm + " km";
    }
}
