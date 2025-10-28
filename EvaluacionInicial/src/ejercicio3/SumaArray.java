package ejercicio3;

public class SumaArray {
    public static void main(String[] args) {
        int numbers[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (byte i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (byte j = 0; j < numbers.length; j++) {
                sum = sum + numbers[i][j];
            }
            System.out.println("La suma de la fila " + (i + 1) + " es: " + sum);
        }
    }

}
