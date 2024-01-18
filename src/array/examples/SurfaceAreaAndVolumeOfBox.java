package array.examples;

public class SurfaceAreaAndVolumeOfBox {
    public static void main(String[] args) {

    }

    public static int[] getSize(int w, int h, int d) {
        int surface = 2 * (w * h + h * d + w * d);
        int volume = w * h * d;
        return new int[]{surface, volume};

    }
}
