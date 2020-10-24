package edu.akarimin.geekle.ch1;

public class USSSwitchCase {

    public static void main(String[] args) {
        Object withSpock = getVolcanoSurvivors(StarTrekChars.SPOCK);
        Object withElim = getVolcanoSurvivors(StarTrekChars.ELIM);
        Object witDef = getVolcanoSurvivors(StarTrekChars.JEANLUC);
        Object withMick = getVolcanoSurvivors(StarTrekChars.MICHAEL_EDDINGTON);
        System.out.println("" + withSpock + withElim + witDef + withMick);
    }

    static Object getVolcanoSurvivors(StarTrekChars chars) {
        return switch (chars) {
            case SPOCK, DATA -> {
                System.out.println("Everyday is rescue day");
                yield Integer.valueOf(129) == 129 ? 10 : 7;
            }
            case JEANLUC -> "6" == new String("6") ? 2 : 4;
            case ELIM -> {
                System.out.println("Hello !");
                yield 128;
            }
            default -> new IllegalStateException("No Survivors !");
        };
    }

    enum StarTrekChars {
        SPOCK,
        DATA,
        JEANLUC,
        MICHAEL_EDDINGTON,
        ELIM
    }
}
