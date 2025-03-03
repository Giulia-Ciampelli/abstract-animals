import org.java.lessons.Aquila;
import org.java.lessons.Cane;
import org.java.lessons.Delfino;
import org.java.lessons.Nuotante;
import org.java.lessons.Volante;
import org.java.lessons.Passerotto;

public class Main {
    public static void faiVolare(Volante animale) {
        animale.vola();
    }

    public static void faiNuotare(Nuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        Passerotto passerotto1 = new Passerotto();
        Cane cane1 = new Cane();
        Aquila aquila1 = new Aquila();
        Delfino delfino1 = new Delfino();

        passerotto1.dormi();
        passerotto1.mangia();
        passerotto1.verso();
        cane1.dormi();
        cane1.mangia();
        cane1.verso();
        aquila1.dormi();
        aquila1.mangia();
        aquila1.verso();
        delfino1.dormi();
        delfino1.mangia();
        delfino1.verso();

        faiVolare(passerotto1);
        faiVolare(aquila1);
        faiNuotare(delfino1);
    }
}
