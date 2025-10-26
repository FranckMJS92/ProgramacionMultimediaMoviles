package ejercicio1;

public class PrintTriangle {
    public static void main(String[] args) {
        lefttriangle(5, "8");
    }

    public static void lefttriangle(int nrows, String simbol) {
        for (int i = 0; i <= nrows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(simbol);
            }
            System.out.println();
        }
    }
}
