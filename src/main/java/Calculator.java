import org.apache.commons.lang.math.NumberUtils;

import java.util.Scanner;


public class Calculator {
    static String val1;
    static String val2;

    static void division(String val1, String val2){
        double val1Double = NumberUtils.toDouble(val1);
        double val2Double = NumberUtils.toDouble(val2);
        if (val2Double != 0){
            System.out.println(val1Double / val2Double);
        } else {
            System.out.println("0 not allowed for Division");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter value 1:");
        val1 = scanner.nextLine();
        System.out.println("Please Enter value 2:");
        val2 = scanner.nextLine();

        division(val1,  val2);
    }
}