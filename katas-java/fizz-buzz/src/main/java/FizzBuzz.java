import java.util.*;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = "FizzBuzz";

    public static List<String> start() {
        final List<String> fizzBuzzValue = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            String currentValue = getString(i);
            fizzBuzzValue.add(currentValue);
        }

        return fizzBuzzValue;
    }

    private static String getString(int i) {
        String currentValue = "";
        currentValue += getFizz(i);
        currentValue += getBuzz(i);
        if(currentValue.isEmpty()){
            currentValue = String.valueOf(i);
        }
        return currentValue;
    }

    private static String getFizz(int value){
        return value % 3 == 0 ? FIZZ : "";
    }
    private static String getBuzz(int value){
        return value % 5 == 0 ? BUZZ : "";
    }
}
