package edu.akarimin.geekle.ch1;

public class WrathOfLambdaVar {

    public static void main(String[] args) {
        System.out.println(new WrathOfLambdaVar().localPlanets());
    }

    private String localPlanets() {
        ISpaceSeed whereIsKhan = (String alphaOne, String alphaTwo) -> alphaOne + alphaTwo;
        ISpaceSeed whenWorldCollide = (s1, s2) -> s1 + s2;
        ISpaceSeed reliantsMistake = (var s1, final var s2) -> s1 + s2;
        return reliantsMistake.collide("Ceti alpha 6", null);
    }

    @FunctionalInterface
    interface ISpaceSeed {

        String collide(String s1, String s2);

    }
}
