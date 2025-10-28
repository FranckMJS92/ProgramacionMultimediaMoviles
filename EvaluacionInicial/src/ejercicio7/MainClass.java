package ejercicio7;

public class MainClass {

    public static void main(String[] args) {
        Curso c1 = new Curso("Programacion");
        Curso c2 = new Curso("Interfaces");
        Curso c3 = new Curso("Moviles");
        Curso c4 = new Curso("Ingles");

        Estudiante e1 = new Estudiante("Franck", 20);
        Estudiante e2 = new Estudiante("Luis", 30);
        Estudiante e3 = new Estudiante("Julia", 15);
        Estudiante e4 = new Estudiante("Maria", 18);

        c1.agregarEstudiante(e1);
        c1.agregarEstudiante(e2);
        c2.agregarEstudiante(e3);
        c2.agregarEstudiante(e4);

        System.out.println(c1.toString());

        c1.quitaEstudiante(1);

        System.out.println(c1.toString());

        Curso.mostrarTotalCursos();

    }

}
