/**
 * Created by Andy on 9/29/2016.
 */
import java.util.Scanner;
public class SimpleCalc {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        double num1 = 0;
        double num2 = 0;
        String sign = "";

        try {
            System.out.print("Enter a numeric value: ");
            num1 = in.nextDouble();
            System.out.print("Enter a numeric value: ");
            num2 = in.nextDouble();
            System.out.print("Choose an operation (+ - * /): ");
            sign = in.next();

            switch (sign) {
                case "+": add(num1, num2);
                    break;
                case "-": subtract(num1, num2);
                    break;
                case "*": multiply(num1, num2);
                    break;
                case "/": divide(num1, num2);
                    break;
                //if user inputs invalid operator, alert them
                default: System.out.println("Invalid Operator");
            }
        //invalid user input for either operand sets off this exception
        } catch (Exception e) {
            System.out.println("Not a valid numeric input!");
        }

    }

    /**
     * A method to take the arithmetic sum of two 64 bit numeric values
     * @param x the first operand
     * @param y the second operand
     */
    public static void add(double x, double y){
        System.out.println(x + y);
    }
    /**
     * A method to take the arithmetic difference of two 64 bit numeric values
     * @param x the first operand
     * @param y the second operand
     */
    public static void subtract(double x, double y){
        System.out.println(x - y);
    }
    /**
     * A method to take the arithmetic product of two 64 bit numeric values
     * @param x the first operand
     * @param y the second operand
     */
    public static void multiply(double x, double y){
        System.out.println(x * y);
    }
    /**
     * A method to take the arithmetic quotient of two 64 bit numeric values
     * @param x the first operand
     * @param y the second operand
     */
    public static void divide(double x, double y){
        System.out.println(x / y);
    }

}