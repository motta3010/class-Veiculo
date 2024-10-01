public class Main{


    // Método estático
    public static void exibirInfoVeiculo(veiculo veiculo) {
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        veiculo.acelerar();
    }

    public static void main(String[] args) {
        // Criando objetos das subclasses
        Carro meuCarro = new Carro("Honda Civic", 2020, 4);
        moto minhaMoto = new moto("Harley Davidson", 2018, false);

        // Chamando o método estático
        exibirInfoVeiculo(meuCarro);
        System.out.println();
        exibirInfoVeiculo(minhaMoto);
    }
}