package Java_Aula_4;
import java.util.Scanner;

public class atendimentoMedico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a oppco Desejada: [ 1 ] Marcar Consulta  --  [ 2 ] Financeiro  --  [ 3 ] Cancelamento  --  [ 4 ] Rede Autorizada  --  [ 5 ] Outros Assuntos ");
        System.out.println();
        int x = sc.nextInt();
        switch (x) {
            case 1:
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Escolha a opcao: ");
                System.out.println("[ 1 ] Marcar Consulta: ");
                System.out.println("[ 2 ] Marcar Exame: ");
                System.out.println("[ 3 ] Cancelar Consulta: ");
                System.out.println("[ 4 ] Cancelar Exame: ");
                int x2 = sc2.nextInt();
                String marc;
                if (x2 == 1){
                    marc = "Marcar Consulta";
                }else if (x2 == 2){
                    marc = "Marcar Exame";
                }else if (x2 == 3){
                    marc = "Cancelar consulta";
                }else if (x2 == 4){
                    marc = "Cancelar Exame";
                }else{
                    marc = "Valor invalido";
                } 
                sc2.close();
                break;
            default:
                break;
        }        
        sc.close();
    }
}
