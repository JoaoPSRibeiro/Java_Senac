

import java.util.Scanner;
public class MaiusculoMinusculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");      
        String frase = sc.nextLine();

        String FraseMaiuscula = frase.toUpperCase();
        System.out.println("A nova Frase em Maiusculo ficou: " + FraseMaiuscula);

        String FraseMinuscula = frase.toLowerCase();
        System.out.println("A nova Frase em Minusculo ficou: " + FraseMinuscula);

        sc.close();
    }
}
