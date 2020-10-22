package edu.akarimin.geekle.ch1;

public class ShipDoor implements AutoCloseable {

    public void open() {
        throw new RuntimeException("Fail to open door!");
    }

    @Override
    public void close() {
        System.out.println("Ship door is closed.");
    }

    public static void main(String[] args) {
        try (ShipDoor shipDoor = new ShipDoor()) {
            shipDoor.open();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("The End.");
        }
    }
}
