public class Casa extends Imovel {

    private int quartos;

    public Casa(String endereco, double area, int quartos) {
        super(endereco, area);
        this.quartos = quartos;
    }

    // Sobrescrita: mesma assinatura, comportamento especializado
    @Override
    public String descrever() {
        return "Casa: " + endereco + ", " + quartos + " quartos";
    }
}
