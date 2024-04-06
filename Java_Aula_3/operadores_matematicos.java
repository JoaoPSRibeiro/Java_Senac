package Java_Aula_3;
import java.util.Scanner;

public class operadores_matematicos {
    public static void main(String[] args) {
        // void é o métodpo consytrutor e main significa principoal
        //a linha de cima cria a estrutura (alicerce) para a aplicação
        Scanner sc = new Scanner(System.in);

        int n1= 10;
        int n2 = 6;
        System.out.print("O resultado da Soma de 10 e 5 eh: ");
        System.out.println(n1 + n2);
        // note que o rint não pula linha e po println pula
        System.out.println("O resultado da subtracao entre 10 e 5: " + (n1-n2)); // concatenado
        System.out.println("a Multiplicaçao de 10 por 5 eh : "+ (n1*n2));
        System.out.println("A divisao entre 10 e 5 eh: "+(n1/n2));
        System.out.println("O resto da divisao entre 10 e 5 eh: " + (n1%n2) );
        int n3 = n1%n2;
        if (n3 == 0){
            System.out.println("O Numero é par");
        }else{
            System.out.println("O Numero impar");
        }
        
        System.out.println("");
        System.out.print("Digite o primeiro numero: ");
        int n4 = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        int n5 = sc.nextInt();

        System.out.print("O resultado da Soma eh: ");
        System.out.println(n4 + n5);
        // note que o rint não pula linha e po println pula
        System.out.println("O resultado da subtracao: " + (n4-n5)); // concatenado
        System.out.println("a Multiplicaçao de eh: "+ (n4*n5));
        System.out.println("A divisao entre eh: "+(n4/n5));
        System.out.println("O resto da divisao eh: " + (n4%n5) );
        int n6 = n4%n5;
        if (n6 == 0){
            System.out.println("O Numero é par");
        }else{
            System.out.println("O Numero impar");
        }
        System.out.println("");
        sc.close();
    
    }
}
