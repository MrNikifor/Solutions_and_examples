package string.example;

public class RemoveTime {
    public static void main(String[] args) {

    }
    public static String shortenToDate(String longDate) {
      return longDate.substring(0,longDate.indexOf(","));
    }
}
