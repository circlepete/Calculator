import org.apache.commons.lang.math.NumberUtils;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Calculator {
    static String val1;
    static String val2;

    static DecimalFormat df = new DecimalFormat("#.##");
    static Scanner scanner = new Scanner(System.in);

    static void division(String val1, String val2){
        double val1double = NumberUtils.toDouble(val1);
        double val2double = NumberUtils.toDouble(val2);

        if (val2double != 0){
            System.out.println("Full Result is: " + val1double / val2double);
            System.out.println("Rounded Result is: " + df.format(val1double / val2double));

        } else {
            System.out.println("0 not allowed for Division");
        }
    }


    public static void main(String[] args) {
        System.out.println("Please Enter value 1:");
        val1 = scanner.nextLine();
        System.out.println("Please Enter value 2:");
        val2 = scanner.nextLine();

        division(val1,  val2);
    }
}