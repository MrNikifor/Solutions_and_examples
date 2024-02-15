package array.examples;

public class PowersOf2 {
    public static void main(String[] args) {

    }
    public static long[] powersOfTwo(int n){
         long[] arr = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long)Math.pow(2,arr[i]);
        }
        return arr;



        //return rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();
    }
}
