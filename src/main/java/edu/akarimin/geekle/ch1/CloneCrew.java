package edu.akarimin.geekle.ch1;

import java.util.Arrays;

public class CloneCrew {

    public static void main(String[] args) {
        String[] crew = new String[] {"Spock", "Scott", "Quark"};
        String[] clones = Arrays.copyOf(crew, 2);

        System.out.println(clones[0]);
        System.out.println(clones[1]);
        System.out.println(clones[2]);
    }
}
