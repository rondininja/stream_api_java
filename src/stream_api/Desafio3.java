package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Desafio 3 - Verifique se todos os números da lista são positivos:
 * Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
 */

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numerosPositivos = numero -> numero > 0;

        boolean todosPositivos = numeros.stream()
                .allMatch(numerosPositivos);

        if (todosPositivos) {
            System.out.println("Todos os números são positivos");
        } else {
            System.out.println("Nem todos os números da lista são positivos");
        }
    }
//    também dá pra fazer individualmente, usando a forma abaixo

//    numeros.stream()
//          .forEach(n -> {if(n > 0) {
//                System.out.println(n + " é positivo");
//            } else {
//                System.out.println(n + " é negativo");
//            }

}
