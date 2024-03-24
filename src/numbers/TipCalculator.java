package numbers;

public class TipCalculator {
    public static void main(String[] args) {
        System.out.println(calculateTip(30d, "poor"));
    }
    public static Integer calculateTip(double amount, String rating) {

        return switch (rating.toLowerCase()){
            case "terrible" -> 0;
            case "poor" -> (int)Math.ceil(amount * 0.05);
            case "good" -> (int)Math.ceil(amount * 0.1);
            case "great" -> (int)Math.ceil(amount * 0.15);
            case "excellent" -> (int)Math.ceil(amount * 0.2);
            default -> null;
        };
    }
}
