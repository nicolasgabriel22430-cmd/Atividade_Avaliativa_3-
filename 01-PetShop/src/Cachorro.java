public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    // Sobrescrita: mesma assinatura, comportamento especializado
    @Override
    public String descrever() {
        return "Cachorro: " + nome + ", raca " + raca;
    }
}
