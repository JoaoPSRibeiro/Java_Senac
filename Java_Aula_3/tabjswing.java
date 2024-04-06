package Java_Aula_3;
import javax.swing.JOptionPane;
// importamos o pacote de interface gráfica do java
public class tabjswing {
    public static void main(String[] args) {
        int numero = 1;
        int y = 0;
        int resultado = 0;          // declaramoas todas as variáveois necessárias para a tabuada
        String mostrar1 = "";

        while ( numero <= 10){ // inicia a tabuada de 1 ao 10
            while (y < 10){ // este laço fará a tabuada do numero que escolhermos
                y = y + 1;
                resultado = numero * y;
            mostrar1 = mostrar1 + "\n" + numero + "X" + y + " = " + resultado;
            } 
            JOptionPane.showMessageDialog(null," Tabuada do " + numero + mostrar1); 
            // ebxibe uma caixa de diálogo fora da IDE
            mostrar1 = "";   
            y = 0;
            numero = numero + 1 ; 
            if (numero == 2){           //Este bloco de decisão serve para parar oi código e não rodar tpodo durante o teste dele
                break;
            }
        
            }
        }
    }

