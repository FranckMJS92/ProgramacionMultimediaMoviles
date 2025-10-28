package ejercicio2;

import java.util.Scanner;

public class Identificadores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String completeName, dateIn, code1 = "", identify;
        int code2, code3, code4;
        char[] name;

        System.out.println("--- SOLICITUD DE DATOS ---");
        System.out.print("Ingrese nombre completo por favor: ");
        completeName = scan.nextLine();

        System.out.print("Ingrese fecha de nacimiento : ");
        dateIn = scan.nextLine();

        // PRIMERA PARTE
        name = completeName.replaceAll("\\s+", "").toCharArray();

        for (char c : name) {
            if ((int) c <= 90) {
                code1 = code1 + c;
            }
        }

        // SEGUNDA PARTE
        code2 = Integer.parseInt(dateIn.substring(0, 2)) +
                Integer.parseInt(dateIn.substring(3, 5))
                + Integer.parseInt(dateIn.substring(6, 10));

        // TERCERA PARTE
        code3 = Integer.parseInt(dateIn.substring(8, 10));

        // CUARTA PARTE
        code4 = completeName.replaceAll("\\s+", "").length();

        // GENERACION IDENTIFICADOR
        identify = code1 + "-" + code2 + "-" + code3 + "" + code4;
        System.out.println("El identificador final del usuario es : " + identify);
        scan.close();
    }

}
