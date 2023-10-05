package FUNCIONARIO;
// Elabore um programa que tenha uma classe chamada Funcionario com os seguintes atributos: nome e salario e crie duas subclasses: Gerente e Diretor, que herdam da classe Funcionário.
// Na classe Gerente, adicione um atributo adicional chamado departamento (String).
// Nesta classe, o gerente possui um método para calcularBonus de 10% do salário.
// Na classe Diretor, adicione um atributo adicional chamado ações (int) que representa a quantidade de ações da empresa que o diretor possui.
// Na classe Main, interaja para o cadastro e exibição dos dados.
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 5000.0, "Vendas");
        System.out.println("Nome do gerente: " + gerente.nome);
        System.out.println("Salário do gerente: " + gerente.salario);
        System.out.println("Departamento do gerente: " + gerente.departamento);
        System.out.println("Bônus do gerente: " + gerente.calcularBonus());

        Diretor diretor = new Diretor("Maria", 10000.0, 1000);
        System.out.println("Nome do diretor: " + diretor.nome);
        System.out.println("Salário do diretor: " + diretor.salario);
        System.out.println("Ações do diretor: " + diretor.acoes);
    }
}
