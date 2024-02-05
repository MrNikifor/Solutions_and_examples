package array.string;

public class ReplaceElement {
    public static void main(String[] args) {

    }
    public static String[] fixTheMeerkat(String[] arr) {
        String n = "";
            n = arr[2];
            arr[2] = arr[0];
            arr[0] = n;
        return arr;
    }
}
