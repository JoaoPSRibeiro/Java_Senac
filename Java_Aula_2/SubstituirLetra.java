import java.util.Scanner;


public class SubstituirLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = sc.nextLine();

        String novaFrase = frase.replace("a", "e");
        String novaFrase2 = novaFrase.toUpperCase();
        for (int i = 0; i <novaFrase2.length(); i++){
            char letra = novaFrase2.charAt(i);
            if (i == 0){
                System.out.print(letra);
            }else{
                System.out.print(" - "+ letra);
            }
        }
        System.out.println("\nFrase Modificada: " + novaFrase2);
        sc.close();
    }
}
