import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaNotas{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("A media do alunos foi: " + df.format(media));

        scanner.close();

        if (media > 6){
            System.out.println("\nSua Media foi " + df.format(media) + " e voce foi Aprovado!!!");
        }else{
            System.out.println("\nSua media foi " + df.format(media) + " e voce foi Reprovado");
        }
        }
            
    }

