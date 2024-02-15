package numbers;

public class ReturnNegative {
    public static void main(String[] args) {

    }

    public static int makeNegative(final int x) {
       /* if (x < 0) {
            return x;
        }
        return -x;*/
        return x < 0 ? x : -x;
    }
}
