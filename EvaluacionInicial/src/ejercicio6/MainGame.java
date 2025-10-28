package ejercicio6;

public class MainGame {
    public static void main(String[] args) {

        Videojuego g1 = new Videojuego("Call of Duty", "Shooter", "Play Station4");

        Videojuego g2 = new Videojuego("Assassin's Creed", "Mundo Abierto", "Play Station 4", 50, false);

        g1.jugar(60);
        g1.marcarComoCompletado();
        System.out.println(g1.toString());

        g2.jugar(60);
        System.out.println(g2.toString());

    }
}
