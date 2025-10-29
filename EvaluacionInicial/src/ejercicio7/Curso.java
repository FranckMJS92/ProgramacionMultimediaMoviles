package ejercicio7;

import java.util.ArrayList;

public class Curso {
    private String nombrecurso;
    private ArrayList<Estudiante> estudiantes;
    private static int totalCursosCreados = 0;

    public Curso(String nombreCurso) {
        this.nombrecurso = nombreCurso;
        estudiantes = new ArrayList<>();
        totalCursosCreados++;
    }

    public void agregarEstudiante(Estudiante E) {
        estudiantes.add(E);
    }

    public void quitaEstudiante(int idEstudiante) {
        for (Estudiante e : estudiantes) {
            if (e.getIdEstudiante() == idEstudiante) {
                estudiantes.remove(e);
            }
        }
    }

    public static void mostrarTotalCursos() {
        System.out.println("Total de cursos : " + totalCursosCreados);
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getTotalCursosCreados() {
        return totalCursosCreados;
    }

    @Override
    public String toString() {
        return "\nCurso : " + nombrecurso + "\n" + estudiantes; // No se me ocurre como formatearlo con el array dentro
    }

}
