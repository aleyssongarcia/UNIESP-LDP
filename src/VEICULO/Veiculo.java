package VEICULO;
// Elabore um programa que tenha uma super classe chamada Veiculo com os seguintes atributos: marca (String), modelo (String) e anoFabricacao (int). Este sistema deve ter duas subclasses: Carro e Moto, que herdam da classe Veículo.
// Na classe Carro, adicione um atributo adicional chamado numPortas (int)
// Na classe Moto, adicione um atributo adicional chamado cilindradas (int)
// Crie um método imprimirDetalhes nas classes Carro e Moto que exiba todos os atributos do veículo, incluindo os atributos herdados da classe Veículo.
// Na classe Main, crie um objeto Carro e um objeto Moto, configure seus atributos e use o método imprimirDetalhes para exibir suas informações.
 public class Veiculo {
    String marca;
    String modelo;
    int anoFabricacao;

    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }
}

