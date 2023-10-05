package IMC;

public class Dados {
    private double peso;
    private double altura;
    private double imc;

    public void setPeso(double peso){
        if (peso >= 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválido!");
        }
    }

    public double getPeso() {
        return this.peso;
    }

    public void setAltura(double altura){
        if (altura >= 0){
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }

    public double getAltura() {
        return this.altura;
    }

    public void setCalc (){
        this.imc = this.peso / (this.altura * this.altura);
    }

    public double getCalc(){
        return imc;
    }
}

