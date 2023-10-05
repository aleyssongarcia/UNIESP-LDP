package VEICULO;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Mustang", 2023, 2);
        carro.imprimirDetalhes();

        Moto moto = new Moto("Honda", "CBR", 2023, 1000);
        moto.imprimirDetalhes();
    }
}
