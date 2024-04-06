import java.text.DecimalFormat;

public class exercicio_aula1 {
    public static void main(String[] args) {
        String nome = "Joao Paulo";
        String sobrenome = "Santos Ribeiro";
        int idade = 39;
        double altura = 1.76;
        double peso = 86.50;
        System.out.println(
                "Ola, sou o " + nome + " " + sobrenome + "e tenho " + idade + "anos de idade.\n" + "Hoje tenho "
                        + peso + " Quilos e " + altura + " de altura.");
        double imc = (peso / (altura * altura)) / 2;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(" Meu IMC atual é: " + df.format(imc));
    }
}