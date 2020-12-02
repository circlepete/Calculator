import org.apache.commons.lang.math.NumberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Calculator {
    static double val1double;
    static double val2double;
    static String operator;
    static String userInput;

    static DecimalFormat df = new DecimalFormat("#.##");
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Math please:");
        userInput = scanner.nextLine()
                .trim()
                .replace(" " , "")
                .replace("," , ".");

        Pattern pattern = Pattern.compile("([-+]?\\d*\\.?\\d+)([*|/+\\-])([-+]?\\d*\\.?\\d+)");
        Matcher matcher = pattern.matcher(userInput);

        if(matcher.find()) {
            val1double = NumberUtils.toDouble(matcher.group(1));
            val2double = NumberUtils.toDouble(matcher.group(3));
            operator = matcher.group(2);

            switch (operator) {
                case "+":
                    System.out.println("Result of Addition: ");
                    System.out.println(df.format(val1double + val2double));
                    break;
                case "-":
                    System.out.println("Result of Subtraction: ");
                    System.out.println(df.format(val1double - val2double));
                    break;
                case "/":
                    if (val2double != 0){
                        System.out.println("Result of Division: ");
                        System.out.println(df.format(val1double / val2double));
                    } else {
                        System.out.println("0 not allowed for Division");
                    }
                    break;
                case "*":
                    System.out.println("Result of Multiplication: ");
                    System.out.println(df.format(val1double * val2double));
                    break;
                default:
                    System.out.println("No operation possible");
                    break;
            }
        } else {
            System.out.println("No operation possible");
        }
    }
}