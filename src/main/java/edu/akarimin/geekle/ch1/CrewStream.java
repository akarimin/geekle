package edu.akarimin.geekle.ch1;

import java.util.Arrays;
import java.util.List;

public class CrewStream {

    public static void main(String[] args) {
        List<String> crew = Arrays.asList("Kirk", "Spock", "Mammad");

        crew                   // Streams are lazy (if possible)
                .stream()
                .peek(System.out::println)
                .limit(2)
                .forEach(System.out::println);
    }
}
