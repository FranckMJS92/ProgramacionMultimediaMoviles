package ejercicio8;

public class Motocicleta extends Vehiculo {

    private int cilindrada;

    public Motocicleta(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public void arrancar() {
        System.out.println("La motocicleta esta arrancando ...");
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta marca " + marca + ", modelo " + modelo + ", cilindrada " + cilindrada + " cc.";
    }

}
