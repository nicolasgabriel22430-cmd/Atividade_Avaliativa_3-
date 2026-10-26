public class Apartamento extends Imovel {

    private int andar;

    public Apartamento(String endereco, double area, int andar) {
        super(endereco, area);
        this.andar = andar;
    }

    // Sobrescrita: mesma assinatura, comportamento especializado
    @Override
    public String descrever() {
        return "Apartamento: " + endereco + ", andar " + andar;
    }
}
