package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Desafio 6 - Verificar se a lista contém algum número maior que 10:
 * Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
 */

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> maiorQueDez = n -> n > 10;

        boolean maioresQueDez = numeros.stream()
                .allMatch(maiorQueDez);

        if (maioresQueDez) {
            System.out.println("A lista tem números maiores que dez");
        } else {
            System.out.println("Nem todos os números da lista são maiores que dez");
        }
    }
//    também dá pra fazer individualmente, usando a forma abaixo

//    numeros.stream()
//          .forEach(n -> {if(n > 10) {
//                System.out.println(n + " é maior que 10");
//            } else {
//                System.out.println(n + " não é maior que 10");
//            }
}
