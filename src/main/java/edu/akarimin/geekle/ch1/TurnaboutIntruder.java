package edu.akarimin.geekle.ch1;

public class TurnaboutIntruder {

    public static void main(String[] args) {
        System.out.println(new TurnaboutIntruder().whoIsKirk());
    }

    private boolean whoIsKirk() {
        Var var = new Var();          // Not Recommended
        var cmdSpock = new Var() {};
        var cptKirk = new Var() {     // New Class with method
            boolean isVar() {
                return true;
            }
        };
        var drLester = (Var) null;    // Cast a null to a class to avoid NPE
        drLester = cptKirk;
        return cptKirk.isVar();
    }

    private static class Var {}
}
