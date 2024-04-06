import java.util.Scanner;
public class ExibirLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digte uma palavra: ");
        String palavra = sc.nextLine();
        
        for (int i = 0; i < palavra.length(); i++){
            char letra = palavra.charAt(i);
            if (i == 0){
                System.out.print(letra);
            } else{
                System.out.print(" -- " + letra);
            }
            sc.close();
        }
    }
}
    
    
