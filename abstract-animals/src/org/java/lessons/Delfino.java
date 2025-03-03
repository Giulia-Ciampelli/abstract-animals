package org.java.lessons;

public class Delfino extends AbstractAnimale implements Nuotante {

    @Override
    public void verso() {
        System.out.println("Il delfino fischia!");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia pesci.");
    }

    @Override
    public void nuota() {
        System.out.println("Sto Nuotando!");
    }

}
