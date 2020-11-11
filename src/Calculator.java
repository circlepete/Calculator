// import org.apache.commons.lang3.StringUtils;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
    private static DecimalFormat df = new DecimalFormat("#.##");

    public static boolean isNumeric(String strNum) {
        try {
            float f = Float.parseFloat(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 1st value:");
        String val1 = userInput.nextLine();

        System.out.println("Enter 2nd value:");
        String val2 = userInput.nextLine();

        if (isNumeric(val1) && (isNumeric(val2) && val2 != "0")) {
            Float result = Float.parseFloat(val1) / Float.parseFloat(val2);
            System.out.println("result: " + df.format(result));

            df.setRoundingMode(RoundingMode.UP);
            System.out.println("result with UP: " + df.format(result));
        } else {
            System.out.println("invalid value entered");
        }


/*    String result;
    boolean isNumeric(String strNumber) {
        if (strNumber == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(strNumber);
            System.out.println("String " + strNumber + " is a number");
        } catch (NumberFormatException nfe) {
            System.out.println("String " + strNumber + " is NOT a number");
            return false;
        }
        return true;
    }
        Calculator.isNumeric("20");
        // division(3.0f, 4.2f);
 */
    }
}