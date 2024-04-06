import java.text.DecimalFormat;
import java.util.Scanner;
public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Declaramos que vamos usar o somponbet Scanner com a Variável sc
        System.out.print("Digite o peso em Quilogramas: ");
        double peso = sc.nextDouble();
        System.out.print("Digite a altura em metros: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        DecimalFormat df = new DecimalFormat("0.000"); //Usado para reduzir as casas decimais
        System.out.println("Seu IMC é: " + df.format(imc));
        System.out.println("O IMC e: " + Math.round(imc)); //Math.round arrendonda o valor para baixo, se for abaixo de 50 o float e para cima se for acima de 51 o float
    
        sc.close(); //Obrtigaório para encerrar o Scanner
    }
}
