public class moto extends veiculo {
    private boolean temCarroSide;

    // Construtor
    public moto(String modelo, int ano, boolean temCarroSide) {
        super(modelo, ano);  // Chama o construtor da superclasse
        this.temCarroSide = temCarroSide;
    }

    // Sobrescrevendo o método acelerar
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    // Getter e Setter
    public boolean getTemCarroSide() {
        return temCarroSide;
    }

    public void setTemCarroSide(boolean temCarroSide) {
        this.temCarroSide = temCarroSide;
    }
}
