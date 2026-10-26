public class Bebida extends Item {

    private int volumeMl;

    public Bebida(String nome, double preco, int volumeMl) {
        super(nome, preco);
        this.volumeMl = volumeMl;
    }

    // Sobrescrita: mesma assinatura, comportamento especializado
    @Override
    public String descrever() {
        return "Bebida: " + nome + ", " + volumeMl + " ml";
    }
}
