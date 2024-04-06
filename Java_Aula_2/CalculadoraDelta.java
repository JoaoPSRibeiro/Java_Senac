import java.text.DecimalFormat;
import java.util.Scanner;
public class CalculadoraDelta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double c = sc.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("O Valor de Delta e: " + df.format(delta));

        sc.close();
    }
}