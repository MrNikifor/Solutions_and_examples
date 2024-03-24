package array.examples;

import java.util.HashMap;

public class FindForceGravityBetweenTwoObjects {
    public static void main(String[] args) {

    }
    public static double solution(double[] arrVal, String[] arrUnit) {
        double ob1 = convertToKilograms(arrVal[0],arrUnit[0]);
        double ob2 = convertToKilograms(arrVal[1],arrUnit[1]);
        double r = convertToMeters(arrVal[2],arrUnit[2]);
        return 6.67e-11 * ((ob1 * ob2)/(Math.pow(r,2)));
    }
    public static double convertToKilograms(double mass, String unit) {
        HashMap<String, Double> unitValues = new HashMap<>();
        unitValues.put("kg", 1.0);
        unitValues.put("g", 1e-3);
        unitValues.put("mg", 1e-6);
        unitValues.put("μg", 1e-9);
        unitValues.put("lb", 0.453592);

        return mass * unitValues.get(unit);
    }
    public static double convertToMeters(double distance, String unit) {
        HashMap<String, Double> unitValues = new HashMap<>();
        unitValues.put("m", 1.0);
        unitValues.put("cm", 1e-2);
        unitValues.put("mm", 1e-3);
        unitValues.put("μm", 1e-6);
        unitValues.put("ft", 0.3048);

        return distance * unitValues.get(unit);
    }

    /*
value of G = 6.67 × 10−11 N⋅kg−2⋅m2

1 ft = 0.3048 m

1 lb = 0.453592 kg

return value must be Newton for force (obviously)

μ copy this from here to use it in your solution
*/
}
