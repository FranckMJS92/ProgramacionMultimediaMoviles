package ejercicio8;

public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(String marca, String modelo, int numPuertas) {
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    @Override
    public void arrancar() {
        System.out.println("El coche esta arrancando ...");
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Coche marca " + marca + ", modelo " + modelo + " y numero de puertas " + numPuertas;
    }

}
