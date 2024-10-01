
public class Carro extends veiculo {
    private int numPortas;

    // Construtor
    public Carro(String modelo, int ano, int numPortas) {
        super(modelo, ano);  // Chama o construtor da superclasse
        this.numPortas = numPortas;
    }

    // Sobrescrevendo o método acelerar
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    // Getter e Setter
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
