package org.java.lessons;

public class Passerotto extends Animale {

    @Override
    public void verso() {
        System.out.println("Il passerotto cinguetta!");
    }

    @Override
    public void mangia() {
        System.out.println("Il passerotto mangia insetti.");
    }

}
