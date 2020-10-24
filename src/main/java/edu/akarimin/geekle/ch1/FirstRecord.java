package edu.akarimin.geekle.ch1;

import java.io.Serializable;

public record FirstRecord<T>(T ship, String name, String planet) {

    public FirstRecord {
        if (!(ship instanceof Serializable))
            throw new RuntimeException();
    }

    public static void main(String[] args) {
        FirstRecord<String> commander = new FirstRecord<>("V-Gar", "Spock", "Vulcan");
        record NewShip(String shipName) { }
        System.out.println(commander.name);
        System.out.println(commander.equals(new FirstRecord<>(new NewShip("V-Ger"),
                "Worf", "Kronos")));
    }
}
