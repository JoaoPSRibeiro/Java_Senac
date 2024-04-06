package Java_Aula_3;
import javax.swing.JOptionPane; // Importamos a biblioteca de interface geráfica JSwing
public class tab_digitando {
    public static void main(String[] args) {
        String resultado; // resultado da tabuada
        String numero; // numero a ser informado
        int cont; // variavel para convertermos para int o valor que fdor digoitado no vcampo numero
        int n;
        
        try{ // o TRY é o  início de uima estritira conduicional try-catch, que permite capturar e tratar a excessão
            numero = JOptionPane.showInputDialog("Digite o número o qual será feita a Tabuada: ");
            // Acima digitamos o número que queremos saber a tabuada
            n = Integer.parseInt(numero);
            // Convertendo a string em int pra podermos operar os números
            resultado = ""; // variável resultado veio vazia para irmos concatenando os resultados a medida que forem calculados

            for (cont=1; cont <=10; cont++){
                resultado += "\n" + cont + "x" + n + "=" + cont * n;
            }
            JOptionPane.showMessageDialog(null,"Tabuada do: " + n + resultado);
            // Acima mostrará o resultado da Tabuada em uma caixa de diálogo
            resultado = "";
        } catch (Exception e){ //Se algyum erro acontecer no TRY, o catch irá executarJ
            JOptionPane.showMessageDialog(null, "Digite só número inteiro!!!");
            //Mostra uma mensagem caso o usuário digite algo diferente de um número
            JOptionPane.showMessageDialog(null, "Erro! Temnte Novamente.");

        }
    }
}
