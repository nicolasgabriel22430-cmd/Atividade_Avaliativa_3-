public class Caderno extends Produto {

    private int folhas;

    public Caderno(String nome, double preco, int folhas) {
        super(nome, preco);
        this.folhas = folhas;
    }

    // Sobrescrita: mesma assinatura, comportamento especializado
    @Override
    public String descrever() {
        return "Caderno: " + nome + ", " + folhas + " folhas";
    }
}
