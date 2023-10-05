package FUNCIONARIO;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public double calcularBonus() {
        return this.salario * 0.10;
    }
}
