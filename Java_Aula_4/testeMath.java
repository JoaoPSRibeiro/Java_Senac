package Java_Aula_4;

import java.lang.Math;

public class testeMath {
    public static void main(String[] args) {
        double a = 4.3;
        double b = 10;

        System.out.println(Math.ceil(a)); // arredonda o valor para cima
        System.out.println(Math.floor(a));// arredonda para baixo
        System.out.println(Math.max(a, b)); // mostra o maior número entre variáveis
        System.out.println(Math.min(a, b)); // mostra o menor número entre variáveis

        System.out.println(Math.round(Math.PI));
        System.out.println(Math.E);

        System.out.println(Math.sqrt(4)); // raíz quadrada
        System.out.println(Math.pow(5,5));

        System.out.println(Math.round(Math.random() * 100)); 
        // round arredonda para baixo
        // random randomiza na faixa escolhida

    }
}
