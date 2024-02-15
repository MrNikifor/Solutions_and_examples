package numbers;

public class ConvertMilesToKilometrsGallonToLiter {
    public static void main(String[] args) {

    }
    public static float mpgToKPM(final float mpg) {
        double kilometersPerLiter = (mpg * 1.609344) / 4.54609188;
        String result = String.format("%.2f", kilometersPerLiter);
        return Float.parseFloat(result);
    }
}
