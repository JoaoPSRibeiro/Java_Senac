import java.util.Scanner;
public class SubistituirLetraV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String novaFrase = "";

        for (int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            if (letra == 'a'){
                novaFrase += 'e';}
            else if (letra =='A'){
                novaFrase += 'E';
            }else {
                novaFrase += letra;
            }
            
        }
        System.out.println("Frase Modificada: " + novaFrase);
        sc.close();
    }
    
}
