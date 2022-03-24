import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Monstruo Sully = new Monstruo("Sully", 3.2f, 1000, true, false, "Azul",
                new ArrayList<>(Arrays.asList("fuerte", "Carismatico", "trabajador")));

    Kid boo = new Kid("Boo",0.50f,20.0f,"blanca con flores");
    Sully.espantar();
    boo.llorar();
    }
}