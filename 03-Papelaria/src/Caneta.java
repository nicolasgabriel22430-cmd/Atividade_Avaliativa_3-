public class Caneta extends Produto {

    private String cor;

    public Caneta(String nome, double preco, String cor) {
        super(nome, preco);
        this.cor = cor;
    }

    // Sobrescrita: mesma assinatura, comportamento especializado
    @Override
    public String descrever() {
        return "Caneta: " + nome + ", cor " + cor;
    }
}
