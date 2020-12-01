import org.apache.commons.lang.math.NumberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Calculator {
    static String userInput;
    static String val1;
    static String val2;

    static DecimalFormat df = new DecimalFormat("#.##");
    static Scanner scanner = new Scanner(System.in);




    static void division(String val1, String val2){
        double val1double = NumberUtils.toDouble(val1);
        double val2double = NumberUtils.toDouble(val2);

//        if (val2double != 0){
//            System.out.println("Full Result is: " + val1double / val2double);
//            System.out.println("Rounded Result is: " + df.format(val1double / val2double));
//
//        } else {
//            System.out.println("0 not allowed for Division");
//        }
    }


    public static void main(String[] args) {
        double val1double;
        double val2double;
        String operator;

        System.out.println("Math please:");
        userInput = scanner.nextLine().trim().replace("," , ".");;
//        String userInput = "4,1235*1,1345".trim().replace(",",".");


        Pattern pattern = Pattern.compile("(\\d+\\.\\d+?)(\\+|\\-|\\/|\\*)(\\d+\\.\\d+)");
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
                    System.out.println("Result of Division: ");
                    System.out.println(df.format(val1double / val2double));
                    break;
                case "*":
                    System.out.println("Result of Multiplication: ");
                    System.out.println(df.format(val1double * val2double));
                    break;
                default:
                    System.out.println("No operation possible");
                    break;
            }
        }
    }
}