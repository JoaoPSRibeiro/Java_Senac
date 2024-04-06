package Java_Aula_3;
import javax.swing.JOptionPane;

public class CalculadoraIMC {
    public static void main(String[] args) {
        String digitePeso;
        String digiteAltura;
        double IMC;
        double peso;
        double altura;
        while (true){
            try{
                digitePeso = JOptionPane.showInputDialog("Digite o peso atual:");
                peso = Double.parseDouble(digitePeso);
                digiteAltura = JOptionPane.showInputDialog("Digite Altura: ");
                altura = Double.parseDouble(digiteAltura);

                IMC = peso / (altura * altura);
                JOptionPane.showMessageDialog(null,"O IMC eh: " + IMC);
                break;
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Digite só número inteiro!!!");
                //Mostra uma mensagem caso o usuário digite algo diferente de um número
                JOptionPane.showMessageDialog(null, "Erro! Tente Novamente.");

            }
        }
        }
    }