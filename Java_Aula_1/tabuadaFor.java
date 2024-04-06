public class tabuadaFor {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 0; i <= 10; i++) { // i que é inteiro começa valendo 1, enquanto i for menor ou igual a 10, soma
                                        // mais 1 ao i
            System.out.println(num + " x " + i + " = " + (num * i)); // Laço for repete enquanto
            // estiver no range determinado
        }
        if (num % 2 == 0) {
            System.out.println("\nEste numero eh par!!!");
        } else {
            System.out.println("\nEste numero eh impar!!!");
        }
        System.out.println(num % 2 == 0); // aqui, o print estã fazendo a comparação e trazendo se é verdadeiro ou
                                          // falso, acima, fizemos a comparação e passamos essa inifo pra ele.
    }
}
