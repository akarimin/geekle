package edu.akarimin.geekle.ch1;

import java.util.Arrays;
import java.util.List;

public class ShipDoorStream {

    public static void main(String[] args) {
        int doorNum = 0;
        List<String> doors = Arrays.asList("A", "B", "C");
        doors.forEach(e -> System.out.println(e + doorNum + 1));
    }
}
