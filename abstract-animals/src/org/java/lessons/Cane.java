package org.java.lessons;

public class Cane extends AbstractAnimale {

    @Override
    public void verso() {
        System.out.println("Il cane abbaia!");
    }

    @Override
    public void mangia() {
        System.out.println("Il cane mangia carne.");
    }
}
