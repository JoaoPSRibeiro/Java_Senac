package Java_Aula_4;
import java.util.Scanner;

public class condicaCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero para saber o dia da semana: ");
        int x = sc.nextInt();
        String dia;
        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terca";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
            default: // este está para o case como o else está para o IF
                dia = "Dia Invalido";
                break;
        }
        System.out.println("Dia da semana: " + dia);
    sc.close();
    }
}