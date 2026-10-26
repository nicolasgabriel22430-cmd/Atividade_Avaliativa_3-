public class Paciente extends Pessoa {

    private String convenio;

    public Paciente(String nome, String convenio) {
        super(nome);
        this.convenio = convenio;
    }

    // Sobrescrita: mesma assinatura, comportamento especializado
    @Override
    public String ficha() {
        return "Paciente: " + nome + ", convenio " + convenio;
    }
}
