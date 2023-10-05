package IMC;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Dados d = new Dados();

        System.out.println("Digite seu peso: ");
        d.setPeso(sc.nextDouble());
        sc.nextLine();
        System.out.println("Digite sua altura: ");
        d.setAltura(sc.nextDouble());

        d.setCalc();

        System.out.println("Seu IMC é: "+ String.format("%.2f",d.getCalc()));
    }
}
