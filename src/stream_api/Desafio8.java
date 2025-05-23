package stream_api;

import java.util.Arrays;
import java.util.List;

/**
 * Desafio 8 - Somar os dígitos de todos os números da lista:
 * Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
 */

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
                .map(String::valueOf)               // Converte cada número em String
                .flatMapToInt(String::chars)        // Transforma cada caractere em IntStream
                .map(c -> c - '0')              // Converte de char para valor numérico
                .sum();                             // Soma tudo

        System.out.println("Soma dos dígitos: " + somaDosDigitos);

    }
}
