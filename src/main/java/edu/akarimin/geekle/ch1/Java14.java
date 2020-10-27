package edu.akarimin.geekle.ch1;

import java.util.ArrayList;
import java.util.Objects;

public class Java14 {

    String model;
    double price;

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Monitor other && model.equals(other.model) && price == other.price;
    }

    private String doSth(String str) {
        boolean b = new ArrayList<Integer>().removeIf(x -> x == 1);
        b = b && Objects.nonNull(str);
        String s = """
                gf3rgg3 t
                t
                 3t
                 t t
                 
                 t 
                 t
                """;
        return b ? "Hi" : "Bye";
    }

    private int switchNew(String s) {
        return switch (s) {
            case "Ali" -> 100;
            case "Boobs" -> 110;
            case "Adel" -> {
                System.out.println("Nice Switch");
                yield 55;
            }
            default -> 0;
        };
    }

    private class Monitor {
        String model;
        double price;
    }
}
