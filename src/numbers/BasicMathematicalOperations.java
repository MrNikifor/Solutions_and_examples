package numbers;

public class BasicMathematicalOperations {
    public static void main(String[] args) {

    }
    public static Integer basicMath(String op, int v1, int v2){
        switch (op){
            case ("+"):
                return v1 + v2;
            case ("-"):
                return v1 - v2;
            case ("*"):
                return v1 * v2;
            default:
                return v1 / v2;
        }
    }
}
