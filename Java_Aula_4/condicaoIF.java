package Java_Aula_4;
import java.util.Scanner;

public class condicaoIF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero para saber o dia da semana: ");
        int x = sc.nextInt();
        String dia;
        while (x <= 7) {
            if (x == 1){
                dia = "Domingo";
            }else if (x == 2){
                dia = "Segunda";
            }else if (x == 3){
                dia = "Terça";
            }else if (x == 4){
                dia = "Quarta";
            }else if (x == 5){
                dia = "Quinta";
            }else if (x == 6){
                dia = "Sexta";
            }else if (x == 7){
    
                dia = "Sabado";
            }else{
                dia = "Valor Invalido";
            }
            System.out.println("");
            System.out.println("Dia da Semana: " + dia);
            break;
        }
        sc.close();
    }
}
