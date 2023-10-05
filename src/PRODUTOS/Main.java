package PRODUTOS;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Produto A", 10.0, 100);

        produto.adicionarEstoque(50);
        produto.vender(30);
        produto.exibirEstoque();
    }
}
