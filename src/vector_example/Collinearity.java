package vector_example;

public class Collinearity {
    public static void main(String[] args) {

    }

    public static boolean collinearity(int x1, int y1, int x2, int y2) {
        //return x1 * y2 == y1 * x2;
        return x1 * y2 - x2 * y1 == 0;
    }
}
