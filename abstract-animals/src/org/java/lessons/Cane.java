package org.java.lessons;

public class Cane extends Animale {

    @Override
    public void verso() {
        System.out.println("Il cane abbaia!");
    }

    @Override
    public void mangia() {
        System.out.println("Il cane mangia carne.");
    }
}
