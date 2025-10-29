package ejercicio7;

public class Estudiante {
    private String nombre;
    private int edad;
    private int idEstudiante;
    private static int idEstudianteContador = 0;

    public Estudiante(String nombre, int edad) {
        idEstudianteContador++;
        this.nombre = nombre;
        this.edad = edad;
        idEstudiante = idEstudianteContador;
    }

    public void esMayorEdad() {
        System.out.println(edad >= 18 ? nombre + " es mayor de edad" : nombre + " no es mayor de edad");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "\nEstudiante : " + nombre + "\nEdad : " + edad + "\nID : " + idEstudiante;
    }

}
