package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Desafio 7 - Encontrar o segundo número maior da lista:
 * Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
 */

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer segundoMaior = numeros.stream()
                .distinct() // Remove duplicados
                .sorted(Comparator.reverseOrder()) // Ordena do maior para o menor
                .skip(1) // Pula o maior
                .findFirst() // Pega o segundo maior
                .orElse(null); // Caso a lista tenha menos de 2 elementos

        System.out.println("Segundo maior número: " + segundoMaior);
    }
}
