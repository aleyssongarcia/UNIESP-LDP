package VEICULO;

public class Moto extends Veiculo {
    int cilindradas;

    public Moto(String marca, String modelo, int anoFabricacao, int cilindradas) {
        super(marca, modelo, anoFabricacao);
        this.cilindradas = cilindradas;
    }

    public void imprimirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano de Fabricação: " + anoFabricacao + ", Cilindradas: " + cilindradas);
    }
}