
package Java_Aula_4;

public class testString {
    public static void main(String[] args) {
        String nome = "João Paulo Santos";
        System.out.println(nome.length()); // conta quantos caracteres tem na string, incluindo espaços

        String nome2 = "Joao Paulo Santos";
        System.out.println(nome2.charAt(2)); // retorna o carctere do indice especificado

        String nome3 = "Joao Paulo Santos";
        System.out.println(nome3.toUpperCase()); // convcerte todos os caracteres em maiusculo

        String nome4 = "Joao PAuLo SAntOs";
        System.out.println(nome4.toLowerCase()); // converte tudo em minúsculo

        String nome5 = "Joao Paulo Santos";
        System.out.println(nome5.substring(0,5)); // vai fatiar a string e retornar apenas a faixa pedida, com uinicio e fim ou apenas inicio
       
        String nome6 = " Joao        ";
        String nome7 = nome6.trim();
        System.out.println(nome7.length());

        String[] nome8 = nome5.split(" ", 0);
        for(String s : nome8){                              // o Split está tirando os espaços entre as palavras
            System.out.print(s);
        }
        System.out.println();
        System.out.println(nome5.replace("Santos","Ribeiro")); 
        // substitui a primeira pela segunda palavra -- OBS As primeiras palaveas têm que ser idênticas na variávels e no replace

        String x = "";
        int a = 11; long b = 222; float c = 3333; double d = 4.444;
        x = x + String.valueOf(a) + " - "; x = x + String.valueOf(b) + " - "; x = x + String.valueOf(c) + " - "; x = x + String.valueOf(d);
        System.out.println("Valores convertidos: ");      // ValueOf converterá qualquer valor numérico em String
        System.out.println(x);

        String nome9 = "João Paulo Santos 0 Ribeiro";
        System.out.println(nome9.indexOf("0"));
        if(nome9.contains("0"));
            System.out.println("Autorizado");



        


    }
}
