package org.java.lessons;

public class Aquila extends AbstractAnimale implements Volante {

    @Override
    public void verso() {
        System.out.println("L'aquila grida!");
    }

    @Override
    public void mangia() {
        System.out.println("L'aquila mangia carne.");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!");
    }

}
