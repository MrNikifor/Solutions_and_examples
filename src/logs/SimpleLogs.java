package logs;

public class SimpleLogs {
    public static void main(String[] args) {

    }
    public static double logs(double x, double a, double b) {
        return (int) (Math.log(a) / Math.log(x)) + (int) (Math.log(b) / Math.log(x));
    }
}
