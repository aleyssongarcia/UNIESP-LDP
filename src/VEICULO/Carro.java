package VEICULO;

public class Carro extends Veiculo {
    int numPortas;

    public Carro(String marca, String modelo, int anoFabricacao, int numPortas) {
        super(marca, modelo, anoFabricacao);
        this.numPortas = numPortas;
    }

    public void imprimirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano de Fabricação: " + anoFabricacao + ", Número de Portas: " + numPortas);
    }
}


