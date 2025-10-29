package ejercicio8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> v1 = new ArrayList<>();

        Coche c1 = new Coche("BMW", "M4", 4);
        Coche c2 = new Coche("AUDI", "TT", 2);

        Motocicleta m1 = new Motocicleta("Harley Davidson", "Nightster", 1868);
        Motocicleta m2 = new Motocicleta("Ducati", "Monster", 890);

        v1.add(c1);
        v1.add(c2);
        v1.add(m1);
        v1.add(m2);

        for (Vehiculo v : v1) {
            System.out.print(v.getMarca() + " " + v.getModelo() + " : ");
            v.arrancar();
        }

        System.out.println();
        
        for (Vehiculo v : v1) {
            System.out.println(v.toString());
        }
    }
}
